package multiThread;
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("mainThread start");
		ThreadGroup group = new ThreadGroup("group1");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread B start");
				for (int i = 0; i < 100; i++) {
					System.out.println("Thread B running : " + i);
				}
				System.out.println("Thread B end");
			}
		};
		Thread threadB = new Thread(group, runnable, "threadNameIsB");
		Thread threadC = new Thread(group, "threadNameIsC");
		Thread threadD = new Thread(() -> {
			System.out.println("Thread B start");
			for (int i = 0; i < 100; i++) {
				System.out.println("Thread B running : " + i);
			}
			System.out.println("Thread B end");
		});
		// threadB.start();
		System.out.println("threadB.getName():" + threadB.getName());
		System.out.println("threadB.getThreadGroup().getName():"
				+ threadB.getThreadGroup().getName());

		// threadB.join(1);
		// for (int i = 0; i < 100; i++) {
		// System.out.println("mainThread running : " + i);
		// }
		System.out.println("mainThread end");

	}

}
