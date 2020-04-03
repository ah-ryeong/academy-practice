package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // no 매개변수 constructor (빈생성자)
@AllArgsConstructor // 모든 매개변수가 있는 constructor
// 클래스 자료형 : beans = Table(DB)
public class MenuItem {
	private String name;
	private int price;
}
