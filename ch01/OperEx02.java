package ch01;

public class OperEx02 {

	public static void main(String[] args) {
		int sum = 0; // int sum; -> ���� �� ��� �� = 0
		int distance = 100;
		int move = 20;

		sum = sum + move;
		System.out.println(sum);

		sum = sum + move;
		System.out.println(sum); // ���� ������ �ȴ�.

		sum = sum + move;
		System.out.println(sum);

		sum = sum + move;
		System.out.println(sum);

		sum = sum + move;
		System.out.println("������ �Ÿ� : " + sum); // ���� (���ڿ� ���ڸ� ���Ѵ�-> ���������ΰ� / ������ ����ȯ)
		System.out.println("������ : " + distance);
	}

}
