package stars.zerg;

import stars.Behavior;
import stars.zerg.Hydra;
import stars.zerg.Ultra;

public abstract class Zerg implements Behavior {
	public void move() {
		System.out.println("�̵�");
	}
	public void repair() {
		System.out.println("�ڿ� ġ��");
	}
	//public abstract void attack();
	
	public static void upgrade() {
		Ultra.attack++;
		Hydra.attack++;
	}
}
