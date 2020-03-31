package stars.zerg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import stars.Behavior;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ultra extends Zerg{
	private String name;
	private int hp;
	public static int attack = 50;
	
	public Ultra(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior Unit) {
		System.out.println("근거리 뿔 공격");		
	}
}
