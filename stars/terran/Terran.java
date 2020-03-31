package stars.terran;

import stars.Behavior;
import stars.terran.Marine;
import stars.terran.Tank;

public abstract class Terran implements Behavior{
	public void move() {
		System.out.println("�̵�");
	}
	public void repair() {
		System.out.println("SCV ġ��");
	}
	//public abstract void attack();
	
	public static void upgrade() {
		Marine.attack++;
		Tank.attack++;
	}
}
