package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MySocketClient {

	Socket socket;

	public MySocketClient() throws Exception {
		socket = new Socket("192.168.0.85", 3000);
		
		ReadThread rt = new ReadThread();
		Thread newWorker = new Thread();
		newWorker.start();
	
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		BufferedReader keyboardln = new BufferedReader(new InputStreamReader(System.in));

		String outputMsg = "";
		while ((outputMsg = keyboardln.readLine()) != null) {
			bw.write(outputMsg + "\n");
			bw.flush();
		}
	}

	class ReadThread implements Runnable {
		@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String inputMsg = "";
				while ((inputMsg = br.readLine()) != null) {
					System.out.println("»ó´ë¹æ : " + inputMsg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
