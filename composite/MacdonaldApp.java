package composite;

public class MacdonaldApp {
	public static void main(String[] args) {
		// BigBurgerSet �߰���!
		BigBurgerSet set1 = new BigBurgerSet();
		System.out.println();
		
		// Burger �߰���!
		Burger burger1 = new Burger();
		System.out.println();
		
		// �ݶ� �߰���
		Coke coke1 = new Coke();
		System.out.println();
		
		// BigBurgerSet �߰���! ���� 1000�� �������� ��� 
		BigBurgerSet set2 = 
				new BigBurgerSet(
						new BigBurger(3000, "����� 1000�� ����"),
						new Coke(),
						new FrenchFried()
						);
		System.out.println();
		
		// BigBurgerSet �߰���! ���� 2000�� �������� ��� 
			BigBurgerSet set3 = 
					new BigBurgerSet(
							new BigBurger(3000, "����� 2000������")
							);
			System.out.println();
				
			// ������ż�Ʈ �߰�
			ShirimpBurgerSet set4 =
					new ShirimpBurgerSet(
							new ShirimpBurger(),
							new Coke(),
							new FrenchFried()
							);		
	}
}
