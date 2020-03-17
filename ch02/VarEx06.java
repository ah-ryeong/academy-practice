package ch02;

class person{
	String name = "000";
	int age = 29;
	char gender = '¿©';
	String email ="abc@gmail.com";
	String phone ="010-0000-0000";
}

public class VarEx06 {

	public static void main(String[] args) {
		person a = new person();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.gender);
		System.out.println(a.email);
		System.out.println(a.phone);
	}

}
