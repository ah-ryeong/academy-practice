package stars;

import stars.protoss.Dragoon;
import stars.protoss.Zealot;

//추상클래스와 유사하다.
// 추상 메서드만 존재가능
public interface Behavior {
	public abstract void move();
	public void repair();
	void attack(Behavior Unit);
}
