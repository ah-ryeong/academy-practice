package ch05;

abstract class food1 {
	abstract void eat();
}

class ���1 extends food1 {
	String name = "���";
	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");
	}
}

class �Ұ���1 extends food1 {
	String name = "�Ұ���";
	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");
	}	
}

class ����1 extends food1 {
	String name = "����";
	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");
	}
}

public class FoodEx01 {
	
	static void start(food1 f) {
		f.eat();
	}

	public static void main(String[] args) {
		start(new ���1());
		start(new ����1());
		start(new �Ұ���1());
	}

}