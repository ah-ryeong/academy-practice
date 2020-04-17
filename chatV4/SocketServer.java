package chatV4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import chatV4.ChatProtocol;

public class SocketServer {

	ServerSocket serverSocket;
	Vector<SocketThread> vc;

	public SocketServer() {
		try {
			serverSocket = new ServerSocket(20000);
			vc = new Vector<>();

			// 메인 스레드는 소켓을 accept() 하고 vector에 담는 역할을 한다.
			while (true) {
				System.out.println("요청 대기");
				Socket socket = serverSocket.accept(); // 클라이언트의 요청을 받는다.
				System.out.println("요청 받음");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 소켓정보 + 타겟 (run) + 식별자 (id)
	class SocketThread extends Thread {
		Socket socket;
		String id;
		BufferedReader reader;
		PrintWriter writer;

		public SocketThread(Socket socket) {
			this.socket = socket;
		}

		// List
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				writer = new PrintWriter(socket.getOutputStream(), true);

				writer.println("please Sign in");
				id = reader.readLine();
				System.out.println("이거실행됨");
				System.out.println(id);
				String line = null;
				while ((line = reader.readLine()) != null) {
					router(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void router(String line) {
			String[] gubun = line.split(":"); // ALL : 안녕, MSG:white:안녕
			String protocol = gubun[0];
			if (protocol.equals(chatV4.ChatProtocol.ALL)) {
				String msg = gubun[1];
				allChat(msg);
			} else if (protocol.equals(chatV4.ChatProtocol.MSG)) {
				String otherId = gubun[1];
				String msg = gubun[2];
				privateChat(otherId, msg);
			}
		}

		public void privateChat(String otherId, String msg) {
			System.out.println(id + " : " + msg + " ip : " + socket.getInetAddress());
			for (SocketThread socketThread : vc) {
				if (socketThread.id.equals(otherId)) {
					socketThread.writer.println(id + " : " + msg);
				} else {
					writer.println("아이디를 찾을 수 없습니다.");
				}
			}
		}
	}

	public static void main(String[] args) {
		new SocketServer();
	}

	public void allChat(String msg) {
		// TODO Auto-generated method stub
		
	}

}
