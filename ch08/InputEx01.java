package ch08;

import java.io.IOException;
import java.io.InputStream;

// ��Ʈ��(Byte) -> ���� �帧
// ���� �带�� ���������� ��ŵθ� ���� �帣�� �ʴ´�.
// ���� �带�� ���������� ���� ���� �帥��(��Ž���)
// �� = Byte
public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // Ű���忡 ����� byte stream : in , type : input stream
		try {
			int data = in.read();
			System.out.println((char)data);// ��ĳ�ʶ� �Ȱ��� , Ű����κ��� �����͸� ������ ����Ұ���
		} catch (IOException e) {
			System.out.println("IO ������ �߻�");
		}
	}

}
