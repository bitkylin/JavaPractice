public class ThreadDemo {

	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("mainThread start");
		Thread threadB = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread B start");
				for (int i = 0; i < 100; i++) {
					System.out.println("Thread B running : " + i);
				}
				System.out.println("Thread B end");
			}
		});
		threadB.start();
		threadB.join(1);
		for (int i = 0; i < 100; i++) {
			System.out.println("mainThread running : " + i);
		}
		System.out.println("mainThread end");

	}

}
