package ch03;

public class Cal {
	static int add(int n1, int n2) {
		int result = n1 + n2;
		// System.out.println("result : " + result);
		return result; // return은 가장 마지막에!! (return이 위에 올라가면 도달할 수 없는 코드가됨 -> 리턴은 실행하면 복귀하니까)
	}

	// minus (매개변수는 int형 두개)(return은 int형)
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	// multi
	static int multi(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	// divide
	static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

	public static void main(String[] args) {

	}

}
