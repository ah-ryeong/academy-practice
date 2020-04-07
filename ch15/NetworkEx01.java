package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

import Airplane.FlightInfo;

public class NetworkEx01 {

	public static FlightInfo getFlightInfo(String depAirportId, String arrAirportId, Integer depPlandTime) {
		// 1번 주소 객체 만들기
		try {
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=9uZekSWh8upBlAith0ziZspDwoC19jOmQ1GyxPNQroPrBckHbmzTLBZWXSIZ62ls9DvW0zk10qhecp9BLLG5Pw%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
			
			// 2번 스트림 연결
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			// 3번 버퍼연결(문자열)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			
			// FileWriter fr = new FileWriter("c:\\utils\\test.html"); //파일에 스트림을 연결한 것
			
			// 4번 문자 더하기 (중요)
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine())!=null) {
				sb.append(input);
			}
			
			System.out.println(sb.toString());

			br.close(); // 버퍼 닫기
			con.disconnect(); // 스트림 닫기
			
			Gson gson = new Gson();
			FlightInfo flightInfo = gson.fromJson(sb.toString(), FlightInfo.class);
			
			return flightInfo;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
