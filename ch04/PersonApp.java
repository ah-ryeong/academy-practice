package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person(); //�ν��Ͻ�ȭ
		p1.name = "�ֽ���";
		p1.job = "�ǻ�";
		p1.age = 45;
		p1.gender = '��';
		p1.bloodType = "AB";
		
		Person p2 = new Person();
		p2.name = "�̹̳�";
		p2.job = "��������";
		p2.age = 28;
		p2.gender = '��';
		p2.bloodType = "O";
		
		Person p3 = new Person();
		p3.name = "��̳�";
		p3.job = "����";
		p3.age = 47;
		p3.gender = '��';
		p3.bloodType = "AB"; 
		
		System.out.println(p3.name);
		System.out.println(p3.job);
		System.out.println(p3.age);
		System.out.println(p3.gender);
		System.out.println(p3.bloodType);
		
		Person p4 = new Person(
				"���Ʒ�",
				"�л�",
				29,
				'��',
				"A"
		);
		
		System.out.println(p4.name);
		System.out.println(p4.job);
		System.out.println(p4.age);
		System.out.println(p4.gender);
		System.out.println(p4.bloodType);
		
	}//end of main()

}//end of class
