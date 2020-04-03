package composite;

import lombok.Data;

@Data
// 자바는 다중 상속이 안됨(부모가 2개일 수 없음)
public class BigBurgerSet {
	private Burger burger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	public BigBurgerSet() {
		this(
				new BigBurger(),
				new Coke(),
				new FrenchFried()
				);
	}
	
	public BigBurgerSet(Burger burger) {
		this(
				burger,
				new Coke(),
				new FrenchFried()
				);
	}
	
	public BigBurgerSet(Burger burger, Coke coke, FrenchFried frenchFried) {
		this.burger = burger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}
}
