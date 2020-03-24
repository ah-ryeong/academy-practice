package array03;

import java.util.Scanner;
import java.util.Random;

public class CardGame {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100);// 0~99까지 임의의 수 생성 
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("0~99");
			int i =1;
			while(true) {//사용자가 마지막에 'n'을 입력하기 전까지 반복 실행 
				
				System.out.println(i + ">>");
				int input = scanner .nextInt();
				
				while(input != k) {//사용자가 정답 못 맞추면
					if(input<k) //사용자가 입력한 수
						System.out.println("더 크게");
					else if(input>k)
						System.out.println("더 작게");
					i++;
					break;
				}
				
				if(input==k) {
					System.out.println("맞았습니다.");
					System.out.println("다시 하시겠습니까? y/n >>");
					
					if(scanner.next().equals("n")) {
						System.out.println("숫자맞추기를 종료합니다.");
						System.exit(0);
					}else 
						break;
				}
			}
		}
	}

}
