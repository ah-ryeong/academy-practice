package chat;

interface StarUnit {
	abstract int getHp();
}

abstract class protoss implements StarUnit {
	abstract int getSh();
}

abstract class Zerg implements StarUnit {

}

class Zealot extends protoss {
	int sh = 100;
	int hp = 100;
	
	@Override
	public int getSh() {
		return sh;
	}
	
	@Override
	public int getHp() {
		return hp;
	}
}

class Ultra extends Zerg {
	int hp = 100;

	@Override
	public int getHp() {
		return hp;
	}
}

public class FinallyEx01 {

	// 상태체크 (hp, sh)
	static void check(StarUnit unit) {
		try {
			Zealot z = (Zealot) unit;
			System.out.println("남은 쉴드는 : " + z.getSh());
			System.out.println("남은 체력은 : "+ z.getHp());
		} catch (Exception e) {
			// 저그
			Ultra u = (Ultra) unit;
			System.out.println("저그는 쉴드가 없습니다.");
			System.out.println("남은 체력은 : " + u.getHp());
		}finally {
			
		}
	}

	public static void main(String[] args) {
		check(new Zealot());
	}

}
