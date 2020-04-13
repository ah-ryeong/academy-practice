package ch13;

// 규약
interface Animal {
	void move(); // 추상메서드
}

abstract class Person {
	abstract void eat();
}

public class AnomyEx01 {

	public static void main(String[] args) {
		// Animal a = new Animal(); 이거 안됨 : 추상메서드가 있으니까 
		// 추상적이니까 object가 될 수 없다. 쟤를 new 하기 위해서는 쟤를 구현한 object 가 있으면 띄울 수 있다.
		// 추상메서드가 구현되어 있지 않아서 new 할 수 없다.
		// Person p = new Person; 추상메서드가 구현되어 있지 않아서 new 할 수 없다.
		// 추상클래스는 추상메서드가 들어올 수 있기 때문에 new를 막아둔다.
	}

}
