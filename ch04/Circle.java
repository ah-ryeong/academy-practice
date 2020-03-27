package ch04;

public class Circle {
	private int radius; //원의 반지름 필드
	private String name; // 원의 이름 필드
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Circle() {
		
	}// 생성자
	
	public double getArea() {//원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;                                   // 레퍼런스 변수  pizza 생성
		pizza = new Circle();                    // Circle 객체 생성
		pizza.setRadius(10);                   // 피자의 반지름을 10으로 설정
		pizza.setName("자바피자");        // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();       // Circle 객체 생성 
		donut.setRadius(2);                         // 도넛의 반지름을 2로 설정
		donut.setName("자바도넛");            // 도넛의 이름 설정
		area = donut.getArea();            // 도넛의 면적 알아내기 
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
