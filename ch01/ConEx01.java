package ch01;

import java.util.Scanner;

public class ConEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = sc.nextBoolean();

		if (true) { // boolean(1bit) ����� �� 2���� : true �� false �� ������.
			System.out.println("���Դϴ�.");
		}

		if (false) {
			System.out.println("���Դϴ�.");
		}

		if (check) { // boolean(1bit) ����� �� 2���� : true �� false �� ������.
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}

}
