package Stars;

abstract class Protoss {
	abstract String getName();
	abstract int getHp();
	abstract void setHp(int hp);
	abstract int getAttack();
	abstract void setAttack(int attack);
}

//��ũ���÷� DarkTempler(50), ���� River(70)
class DarkTempler extends Protoss {
	final String NAME;
	int hp;
	static int attack = 50;
	
	public DarkTempler(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		
	}
}

class River extends Protoss {
	final String NAME;
	int hp;
	static int attack = 70;
	
	public River(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {		
	}
}


class Zealot extends Protoss {
	final String NAME;
	int hp;
	static int attack = 10;

	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		
	}
}

class Dragoon extends Protoss {
	final String NAME;
	int hp;
	static int attack = 15;

	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		
	}
}

public class GameStart {
	
	//���� => ��� ��������!
	static void attack(Zealot u1, Dragoon u2) {
		u2.setHp(u2.hp = u2.hp - u1.getAttack());
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Zealot u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}
	
	static void attack(Dragoon u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�.");
	}

	public static void main(String[] args) {
		//���ݷ� ���׷��̵��ϱ�
		Zealot.attack ++;
		
		//���� �����ϱ�
		Zealot z1 = new Zealot("1������");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2������");
		System.out.println(Zealot.attack);
		
		Dragoon d1 = new Dragoon("1�� ���");
		System.out.println(Dragoon.attack);
		
		Dragoon d2 = new Dragoon("2�� ���");
		System.out.println(Dragoon.attack);
		
		DarkTempler t1 = new DarkTempler("1�� ��ũ���÷�");
		System.out.println(DarkTempler.attack);
		
		River r1 = new River("1�� ����");
		System.out.println(River.attack);
		
		// �����ϱ�
		attack(z1,d1);
		attack(z1,d1);
		
		attack(d1,z1);
		attack(z1,z2);
		attack(d1,d2);
		
		// ��ũ���÷� ���� ,  ����
		attack(t1, z1);
		attack(t1,d1);
		attack(t1,r1);
		attack(z1,t1);
		attack(d1,t1);
		attack(r1,t1);
		
		// ����
		attack(r1,z1);
		attack(r1,d1);
		attack(z1,r1);
		attack(d1,r1);
	}

}
