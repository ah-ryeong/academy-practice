package stars;

import stars.protoss.Dragoon;
import stars.protoss.Zealot;

//�߻�Ŭ������ �����ϴ�.
// �߻� �޼��常 ���簡��
public interface Behavior {
	public abstract void move();
	public void repair();
	void attack(Behavior Unit);
}
