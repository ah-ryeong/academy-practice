package array03;

public class StarEx01 {

	static void printStars(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	/*	for (int a = 0; a <5; a++) {      //행의 개수
			printStars(i);     // 열의 개수 				
			}*/
		/*
		 * printStars(4); printStars(3); printStars(2); printStars(1);
		 */
		    for (int i = 4; i > 0 ; i--) {
				printStars(i);
			}
		}
	}