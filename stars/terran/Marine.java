package stars.terran;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import stars.Behavior;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Marine extends Terran {
	private String name;
	private int hp;
	public static int attack;
	
	public Marine(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	@Override
	public void attack(Behavior Unit) {
		System.out.println("원거리 기관총 공격");
	}
}
