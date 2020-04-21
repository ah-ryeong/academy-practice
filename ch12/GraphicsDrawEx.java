package ch12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawEx extends JFrame {
	private Mypanel panel = new Mypanel();
	
	public GraphicsDrawEx() {
		setTitle("그래프만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	class Mypanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawString("2019.10", 70, 400);
			g.drawRect(76, 180, 30, 200);
			g.drawString("2019.11", 270, 400);
			g.drawRect(275, 250, 30, 130);
			g.drawString("2019.12", 460, 400);
			g.drawRect(466, 100, 30, 280);
			
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawEx();
	}

}
