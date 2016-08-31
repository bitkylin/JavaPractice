package multiThread;
public class DaemonDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("lml");
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
	}

}
