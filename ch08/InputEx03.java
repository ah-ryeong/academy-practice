package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputEx03 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);

		BufferedReader br = new BufferedReader(reader);

		// 위 3개를 한줄로 적을 수 있음
		BufferedReader br2 = new BufferedReader(new InputStreamReader(in));

		String data = "";
		try {
			while ((data = br2.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
