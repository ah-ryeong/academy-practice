package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // no �Ű����� constructor (�������)
@AllArgsConstructor // ��� �Ű������� �ִ� constructor
// Ŭ���� �ڷ��� : beans = Table(DB)
public class MenuItem {
	private String name;
	private int price;
}
