package ch05;

abstract class food1 {
	abstract void eat();
}

class 라면1 extends food1 {
	String name = "라면";
	@Override
	void eat() {
		System.out.println(name + "을 먹었습니다.");
	}
}

class 불고기1 extends food1 {
	String name = "불고기";
	@Override
	void eat() {
		System.out.println(name + "을 먹었습니다.");
	}	
}

class 갈비1 extends food1 {
	String name = "갈비";
	@Override
	void eat() {
		System.out.println(name + "을 먹었습니다.");
	}
}

public class FoodEx01 {
	
	static void start(food1 f) {
		f.eat();
	}

	public static void main(String[] args) {
		start(new 라면1());
		start(new 갈비1());
		start(new 불고기1());
	}

}
