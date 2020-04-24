package dateex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// 6���� ��ȣ - (1~45)
		
		// HashSet : ������ ���� (��û ������)
		// TreeSet : ������� ���� (HashSet���� ������)
		Set<Integer> lottoSet = new HashSet<>();
		Random r = new Random();
		while (lottoSet.size() < 6) {
			int value = r.nextInt(45)+1;
			lottoSet.add(value);
		}
		System.out.println(lottoSet);
		
		System.out.println(Math.PI); // �������� ��� ��� 
		System.out.println(Math.ceil(3.14)); // ceil (�ø�) 
		System.out.println(Math.floor(3.14)); // floor (����)
		System.out.println(Math.sqrt(9)); // ������
		System.out.println(Math.exp(2)); // e�� 2��
		System.out.println(Math.round(3.14)); // �ݿø�
		
		// [1, 45] ������ ������ ���� 5�� �߻�
		System.out.println(" �̹��� ����� ��ȣ�� ");
		for (int i = 0; i <5; i++) {
			System.out.print((int)(Math.random()*45 + 1) + " "); // ���� �߻� 
		}
	}

}
