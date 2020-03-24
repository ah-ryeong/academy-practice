package array03;

public class StarEx02 {
	
	static void printStars(int i) {
			if(i==1) {
				for (int j = 0; j < 4-i; j++) {
					System.out.print("_");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i==2) {
				for (int j = 0; j < 3-i; j++) {
					System.out.print("__");
				}
				for (int j = 0; j < 3-i; j++) {
					System.out.print("**");
				}
				System.out.println();
			}
			if(i==3) {
				for (int j = 0; j < 4-i; j++) {
					System.out.print("_");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i==4) {
				System.out.print("");
				for (int j = 0; j < 0; j++) {
					System.out.print("_");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	
	
	public static void main(String[] args) {
		printStars(1);
		printStars(2);
		printStars(3);
		printStars(4);
	}
}