package ch13;

class Sub implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("서브  스레드 : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {

	// 메인 스레드
	public static void main(String[] args) {
		Thread t1 = new Thread(new Sub()); // new Sub : target
		t1.start();

		for (int i = 1; i < 6; i++) {
			System.out.println("메인 스레드 : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
