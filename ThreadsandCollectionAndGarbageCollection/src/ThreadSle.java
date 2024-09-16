import java.time.LocalTime;

public class ThreadSle extends Thread {

	String th;

	ThreadSle(String th) {
		this.th = th;
		LocalTime now = LocalTime.now();
		System.out.println(now);
	}

	public void fg() {
		try {
			for (int i = 0; i < 2; i++) {

				Threadsl();
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread");
		}
	}

	private void Threadsl() {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
		System.out.println(now);
	}

	public static void main(String[] args) {
		ThreadSle t = new ThreadSle("Mythread");
		t.start();
	}

}
