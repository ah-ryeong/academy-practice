package Stars;

abstract class Protoss {
	abstract String getName();
	abstract int getHp();
	abstract void setHp(int hp);
	abstract int getAttack();
	abstract void setAttack(int attack);
}

//다크템플러 DarkTempler(50), 리버 River(70)
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
	
	//질럿 => 드라군 때릴거임!
	static void attack(Zealot u1, Dragoon u2) {
		u2.setHp(u2.hp = u2.hp - u1.getAttack());
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Zealot u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}
	
	static void attack(Dragoon u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다.");
	}

	public static void main(String[] args) {
		//공격력 업그레이드하기
		Zealot.attack ++;
		
		//질럿 생성하기
		Zealot z1 = new Zealot("1번질럿");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2번질럿");
		System.out.println(Zealot.attack);
		
		Dragoon d1 = new Dragoon("1번 드라군");
		System.out.println(Dragoon.attack);
		
		Dragoon d2 = new Dragoon("2번 드라군");
		System.out.println(Dragoon.attack);
		
		DarkTempler t1 = new DarkTempler("1번 다크템플러");
		System.out.println(DarkTempler.attack);
		
		River r1 = new River("1번 리버");
		System.out.println(River.attack);
		
		// 공격하기
		attack(z1,d1);
		attack(z1,d1);
		
		attack(d1,z1);
		attack(z1,z2);
		attack(d1,d2);
		
		// 다크템플러 공격 ,  수비
		attack(t1, z1);
		attack(t1,d1);
		attack(t1,r1);
		attack(z1,t1);
		attack(d1,t1);
		attack(r1,t1);
		
		// 리버
		attack(r1,z1);
		attack(r1,d1);
		attack(z1,r1);
		attack(d1,r1);
	}

}
