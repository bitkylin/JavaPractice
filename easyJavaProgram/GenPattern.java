public class GenPattern {
	/**
	 * 生成图案；LINE_NUM为生成图案的行数
	 */
	public static void main(String args[]) {
		final int LINE_NUM = 10;
		for (int i = 1; i <= LINE_NUM; i++) {
			for (int j = LINE_NUM - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
