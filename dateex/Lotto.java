package dateex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// 6개의 번호 - (1~45)
		
		// HashSet : 순서가 없음 (엄청 빠르다)
		// TreeSet : 순서대로 정렬 (HashSet보다 느리다)
		Set<Integer> lottoSet = new HashSet<>();
		Random r = new Random();
		while (lottoSet.size() < 6) {
			int value = r.nextInt(45)+1;
			lottoSet.add(value);
		}
		System.out.println(lottoSet);
		
		System.out.println(Math.PI); // 원주율의 상수 출력 
		System.out.println(Math.ceil(3.14)); // ceil (올림) 
		System.out.println(Math.floor(3.14)); // floor (내림)
		System.out.println(Math.sqrt(9)); // 제곱근
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println(" 이번주 행운의 번호는 ");
		for (int i = 0; i <5; i++) {
			System.out.print((int)(Math.random()*45 + 1) + " "); // 난수 발생 
		}
	}

}
