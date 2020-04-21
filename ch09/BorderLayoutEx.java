package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 컨텐트팬에 BorderLayout 배치관리자 설정
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("Add"), BorderLayout.NORTH);
		c.add(new JButton("Sub"), BorderLayout.SOUTH);
		c.add(new JButton("Mul"), BorderLayout.EAST);
		c.add(new JButton("Div"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
