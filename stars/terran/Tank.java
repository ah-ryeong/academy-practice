package stars.terran;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import stars.Behavior;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tank extends Terran {
	private String name;
	private int hp;
	public static int attack = 30;
	
	public Tank(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	@Override
	public void attack(Behavior Unit) {
		System.out.println("´ëÆ÷");
	}
}
