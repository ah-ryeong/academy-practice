package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 문자로 읽고 싶음 
// 한개 이상을 받고 싶음
// 중간과정으로 쓸 일은 거의 없음 
public class InputEx02 {

	public static void main(String[] args) {
		InputStream in = System.in;
		
		InputStreamReader reader = new InputStreamReader(in);
		
		char[] data = new char[2];
		try {
			reader.read(data);
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
