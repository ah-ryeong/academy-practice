package Animal;

interface Animal {
	void run();
	void sound();
}

class Dog implements Animal {
	@Override
	public void run() {
		System.out.println("강아지 달린다.");
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}

class Bird implements Animal {
	@Override
	public void run() {
		System.out.println("새는 달린다.");
	}
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
	
	void fly() {
		System.out.println("새는 난다");
	}
}

public class AnimalEx02 {
	
	static void start(Animal a) {
		a.run();
		a.sound();
		if(a instanceof Bird) {
			//fly 메서드를 가진 놈이라는걸 확신
			((Bird) a).fly();
		}
	}

	public static void main(String[] args) {
		Animal d = new Dog();
		d.run();
		d.sound();
		
		Animal a = new Bird();
		a.run();
		a.sound();
	}

}
