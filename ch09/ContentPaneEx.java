package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.AbstractDocument.Content;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame"); // ������ Ÿ��Ʋ �ޱ� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� �����ϵ��� ����
		
		Container contentPane = getContentPane(); // ����Ʈ ���� �˾Ƴ���.
		contentPane.setBackground(Color.ORANGE); // ����Ʈ���� ���� ��������
		contentPane.setLayout(new FlowLayout()); // ����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ� 
		
		contentPane.add(new JButton("OK")); // OK ��ư �ޱ�
		contentPane.add(new JButton("CANCEL")); // CANCEL ��ư �ޱ�
		contentPane.add(new JButton("IGNORE")); // IGNORE ��ư �ޱ� 
		
		setSize(300, 150); // ������ũ�� 300X150 ����
		setVisible(true); // ȭ�鿡 ������ ��� 
	}


	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
