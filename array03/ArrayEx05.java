package array03;

import java.util.Scanner;

/**
 * ���� 1000000000�� �Է¹ް� (10��)
 * 3�ڸ����� �޸��� �� ���!!
 *1,000,000,000
 */

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num +"";
		//a-b-c : tempNum.split("-");
		//abc : tempNum.split("");
		String tempNum2[] = tempNum.split("");
		
		int len = tempNum2.length;
		
		for (int i = 0; i < len; i++) {
			if((len-i)%3==0 && i !=0){
				System.out.print(",");
			}
			System.out.print(tempNum2[i]);
		}
	}

}
