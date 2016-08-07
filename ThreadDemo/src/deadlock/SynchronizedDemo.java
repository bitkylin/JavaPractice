package deadlock;

public class SynchronizedDemo {

	public SynchronizedDemo() {
	}

	public static void main(String[] args) {
		RescouceFight fight1 = new RescouceFight("thread1", 11);
		RescouceFight fight2 = new RescouceFight("thread2", 22);
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				fight1.fighting(fight2);
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				fight2.fighting(fight1);
			}
		});

		thread1.start();
		thread2.start();
	}

}
