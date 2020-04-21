package ch14;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventEx06 extends JFrame {

	int imgX = 210;
	int imgY = 55;
	
	public EventEx06() {
		setTitle("��ǳ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 300);
		setLocationRelativeTo(null); // �������� ȭ�� ��� ��ġ 
		setContentPane(new MyPanel());
		setVisible(true);
	}

	// paintComponent �Լ��� Frame �ȿ��� �۵����� �ʴ´�.
	class MyPanel extends JPanel {
		
		public MyPanel() {
			setFocusable(true);
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					System.out.println("keycode : " + e.getKeyCode());
					System.out.println("keychar : " + e.getKeyChar());
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT : // ����  Ű�� Ŭ���ϸ� 0x25
						imgX = imgX - 10;
						break;
					case KeyEvent.VK_RIGHT : // ������ Ű�� Ŭ���ϸ� 0x27
						imgX = imgX + 10;
						break;
					case KeyEvent.VK_SPACE : //0x20
						new Thread(new Runnable() {
							@Override
							public void run() {
								int time = 20;
								while(time > 0) {
									imgX = imgX + 10;
									time--;
									try {
										Thread.sleep(100);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
									repaint();
								}
							}
						}).start();
						break;
					}
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			ImageIcon imgBear = new ImageIcon("img/1.png");
			ImageIcon imgPa = new ImageIcon("img/ice2.png");
			
			// �̹��� ����
			Image bear = imgBear.getImage();
			Image pa = imgPa.getImage();
			
			g.drawImage(bear, 0,0,null);
			g.drawImage(pa, imgX, imgY, null);
		}
	}
	
	public static void main(String[] args) {
		new EventEx06();
	}

}
