package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class PJ extends JFrame {
	
	private static JTextField tf = new JTextField(20);
	private static JTextArea ta = new JTextArea(7, 20);
	

	

	public PJ() {
		setTitle("실기시험");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b = new JButton("전송");
		b.addMouseListener(new click());
		
		// 컨탠트팬에 레이블 부착
		c.add(new JLabel("번호 "));
		c.add(tf);
		c.add(new JLabel("내용 "));
		c.add(ta);
		c.add(new JScrollPane(ta));
		c.add(b);
		
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public void msg() {
		String api_key = "";
	    String api_secret = "";
	    Message coolsms = new Message(api_key, api_secret);
	    
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", tf.getText());
	    params.put("from", "01027639225");
	    params.put("type", "SMS");
	    params.put("text", ta.getText());
	    params.put("app_version", "test app 1.2"); // application name and version
	    
	    try {
	        JSONObject obj = (JSONObject) coolsms.send(params);
	        System.out.println(obj.toString());
	      } catch (CoolsmsException e) {
	        System.out.println(e.getMessage());
	        System.out.println(e.getCode());
	      }
	}
	
	public static void main(String[] args) {
		new PJ();
		
	}
	
	class click extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			msg();
		}
	}

}
