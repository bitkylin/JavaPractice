package deadlock;

public class RescouceFight {

	private String str;
	private int num;
	private int count = 0;

	public RescouceFight(String str, int num) {
		this.str = str;
		this.num = num;
	}

	/**
	 * 去掉operateCount() 方法中的synchronized关键词即可解除死锁状态
	 * 
	 * @return count的计数
	 */
	synchronized int operateCount() {
		return ++count;
	}

	synchronized void fighting(RescouceFight fight) {
		System.out.println(str + ":" + "Start!!!");
		System.out.println("sleepStart: " + str + "," + num + " count-"
				+ fight.operateCount());
		// System.out.println("sleepEnd: " + str + "," + num + " count-"
		// + fight.operateCount());

	}

	public int getNum() {
		return num;
	}

}
