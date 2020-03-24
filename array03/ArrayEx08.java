package array03;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 대문자를 입력하세요");
		String input = sc.next();
		
		int ch = 65;
		char c = input.charAt(0);
		for (int i =(int)c+1; i <=90; i++) {
			System.out.print((char)i);
		}
	}

}
