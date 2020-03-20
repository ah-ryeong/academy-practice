package ch03;

//메서드(함수)는 클래스 안에 작성할 수 있다.
//메서드(함수)는 메서드(함수)안에 작성할 수 없다.(class 바로 밑(전역공간)에 넣으면 된다.)
public class MethodEx01 {


	public static void main(String[] args) {
		int num = Cal.add(5, 3);
		System.out.println("결과 : " + num);

		num = Cal.minus(8, 5);
		System.out.println("결과 : " + num);

		num = Cal.multi(5, 10);
		System.out.println("결과 : " + num);
		
		num = Cal.divide(10, 2);
		System.out.println("결과 : " + num);
	}

}
