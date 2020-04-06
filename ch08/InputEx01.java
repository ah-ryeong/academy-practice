package ch08;

import java.io.IOException;
import java.io.InputStream;

// 스트림(Byte) -> 물의 흐름
// 물이 흐를때 수도꼭지를 잠궈두면 물이 흐르지 않는다.
// 물이 흐를때 수도꼭지를 열면 물이 흐른다(통신시작)
// 물 = Byte
public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // 키보드에 연결된 byte stream : in , type : input stream
		try {
			int data = in.read();
			System.out.println((char)data);// 스캐너랑 똑같음 , 키보드로부터 데이터를 받으면 출력할거임
		} catch (IOException e) {
			System.out.println("IO 오류가 발생");
		}
	}

}
