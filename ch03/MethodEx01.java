package ch03;

//�޼���(�Լ�)�� Ŭ���� �ȿ� �ۼ��� �� �ִ�.
//�޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.(class �ٷ� ��(��������)�� ������ �ȴ�.)
public class MethodEx01 {


	public static void main(String[] args) {
		int num = Cal.add(5, 3);
		System.out.println("��� : " + num);

		num = Cal.minus(8, 5);
		System.out.println("��� : " + num);

		num = Cal.multi(5, 10);
		System.out.println("��� : " + num);
		
		num = Cal.divide(10, 2);
		System.out.println("��� : " + num);
	}

}
