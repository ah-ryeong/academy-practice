package composite;

public class MacdonaldApp {
	public static void main(String[] args) {
		// BigBurgerSet 추가요!
		BigBurgerSet set1 = new BigBurgerSet();
		System.out.println();
		
		// Burger 추가요!
		Burger burger1 = new Burger();
		System.out.println();
		
		// 콜라 추가요
		Coke coke1 = new Coke();
		System.out.println();
		
		// BigBurgerSet 추가요! 버거 1000원 할인쿠폰 사용 
		BigBurgerSet set2 = 
				new BigBurgerSet(
						new BigBurger(3000, "빅버거 1000원 할인"),
						new Coke(),
						new FrenchFried()
						);
		System.out.println();
		
		// BigBurgerSet 추가요! 버거 2000원 할인쿠폰 사용 
			BigBurgerSet set3 = 
					new BigBurgerSet(
							new BigBurger(3000, "빅버거 2000원할인")
							);
			System.out.println();
				
			// 새우버거세트 추가
			ShirimpBurgerSet set4 =
					new ShirimpBurgerSet(
							new ShirimpBurger(),
							new Coke(),
							new FrenchFried()
							);		
	}
}
