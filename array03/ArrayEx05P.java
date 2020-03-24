package array03;

import java.util.Scanner;

public class ArrayEx05P {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num +"";
		//a-b-c : tempNum.split("-");
		//abc : tempNum.split("");
		String tempNum2[] = tempNum.split("");
	
		int p = (tempNum2.length % 3);
		for (int j = 0; j < tempNum2.length; j++) {
			//첫째자리 앞에, 이 붙으면 안되니까 첫 조건으로
			if(j==0) tempNum2[j] = "" + tempNum2[j];
			//i를 3으로 나눈 것이 p값과 같으면 앞에,를 붙임
			else if (j%3==p)tempNum2[j] = "," + tempNum2[j];
			//자릿수대로 출력
			System.out.print(tempNum2[j]);
		}
	}

}
