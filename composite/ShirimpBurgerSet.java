package composite;

import lombok.Data;

@Data
public class ShirimpBurgerSet {
	private Burger burger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	public ShirimpBurgerSet() {
		this(
				new ShirimpBurger(),
				new Coke(),
				new FrenchFried()
				);
	}
	
	public ShirimpBurgerSet(Burger burger, Coke coke, FrenchFried frenchFried) {
		this.burger = burger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}
}
