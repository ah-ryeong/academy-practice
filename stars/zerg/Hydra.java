package stars.zerg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import stars.Behavior;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hydra extends Zerg {
	private String name;
	private int hp;
	public static int attack = 20;
	
	public Hydra(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior Unit) {
		System.out.println("원거리 독침 공격");		
	}
}
