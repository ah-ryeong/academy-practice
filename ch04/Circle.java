package ch04;

public class Circle {
	private int radius; //���� ������ �ʵ�
	private String name; // ���� �̸� �ʵ�
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Circle() {
		
	}// ������
	
	public double getArea() {//���� ���� ��� �޼ҵ�
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;                                   // ���۷��� ����  pizza ����
		pizza = new Circle();                    // Circle ��ü ����
		pizza.setRadius(10);                   // ������ �������� 10���� ����
		pizza.setName("�ڹ�����");        // ������ �̸� ����
		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();       // Circle ��ü ���� 
		donut.setRadius(2);                         // ������ �������� 2�� ����
		donut.setName("�ڹٵ���");            // ������ �̸� ����
		area = donut.getArea();            // ������ ���� �˾Ƴ��� 
		System.out.println(donut.name + "�� ������ " + area);
	}

}
