package array03;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6자리 숫자를 입력하세요.");
		int num = sc.nextInt(); //6자리수 입력
		
		String strNum = num + "";//문자로 묵시적 형변환
		//System.out.println(strNum.charAt(2));//어떤 지점의 index를 통해서 값을 찾을 수 있다.
		//System.out.println(strNum.length());
		
		int len = strNum.length();
		boolean check = false;
		for (int i = 0; i < len; i++) {
			if(strNum.charAt(i)=='3') {
				check = true;
			}
		}
		if(check) {
			System.out.println("3이 존재합니다.");
		}else {
			System.out.println("3이 존재하지 않습니다.");
		}
	}
}
