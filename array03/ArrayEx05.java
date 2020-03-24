package array03;

import java.util.Scanner;

/**
 * 숫자 1000000000를 입력받고 (10억)
 * 3자리마다 콤마를 찍어서 출력!!
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
