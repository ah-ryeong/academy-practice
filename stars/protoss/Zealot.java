package stars.protoss;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import stars.Behavior;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Zealot extends Protoss {
	private String name;
	private int hp;
	private int sh; // 보호막
	public static int attack = 10;
	
	public Zealot(String name) {
		this.name = name;
		this.hp = 100;
		this.sh = 100;
	}
	@Override
	public void attack(Behavior Unit) {
		System.out.println("근거리 공격");
	}
}
