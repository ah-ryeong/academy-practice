package covid19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class Mask {
	public static long getTotalCount() {
		
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) !=null) {
				sb.append(input);
			}
			
			System.out.println(sb.toString());
			System.out.println();
			
			br.close();
			con.disconnect();
			
			Gson gson = new Gson();
			MaskInfo maskInfo = gson.fromJson(sb.toString(), MaskInfo.class);
			
			return maskInfo.getTotalPages();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	public static MaskInfo getMaskInfo(int page) {
		
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page="+page);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) !=null) {
				sb.append(input);
			}
			
			System.out.println(sb.toString());
			System.out.println();
			
			br.close();
			con.disconnect();
			
			Gson gson = new Gson();
			MaskInfo maskInfo = gson.fromJson(sb.toString(), MaskInfo.class);
			
			return maskInfo;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		//for(int i = 1; i <= getTotalCount(); i++) {
		//	getMaskInfo(i);
		//}
		System.out.println("지역을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String loc = sc.nextLine();
		
		List<StoreInfo> pr = getMaskInfo(1).getStoreInfos();
		
		for (int i = 0; i < pr.size(); i++) {
			if (pr.get(i).getAddr().contains(loc)) {
				System.out.println(pr.get(i).getAddr());
			}
		}
		System.out.println(getMaskInfo(0).getStoreInfos());
	}

}
