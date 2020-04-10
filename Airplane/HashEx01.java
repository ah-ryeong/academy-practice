package Airplane;

import java.util.HashMap;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String, String> auth =
				new HashMap<>();
		
		// 값을 넣을 거임
		auth.put("아이디", "ssarmange");
		auth.put("비밀번호", "1234");
		auth.put("아이디", "cos");
		
		System.out.println(auth.get("아이디"));
	}

}
