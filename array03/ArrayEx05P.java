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
			//ù°�ڸ� �տ�, �� ������ �ȵǴϱ� ù ��������
			if(j==0) tempNum2[j] = "" + tempNum2[j];
			//i�� 3���� ���� ���� p���� ������ �տ�,�� ����
			else if (j%3==p)tempNum2[j] = "," + tempNum2[j];
			//�ڸ������ ���
			System.out.print(tempNum2[j]);
		}
	}

}
