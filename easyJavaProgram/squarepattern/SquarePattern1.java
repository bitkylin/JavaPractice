package squarepattern;

/**
 * （算法2）
 * 给定整数n，以下列方式打印n行：
 * 1*2*3*4
 * 9*10*11*12
 * 13*14*15*16
 * 5*6*7*8
 * <p>
 * 各行输出只能由数字和"*"组成，不应有空格
 */
public class SquarePattern1 {
    public static void main(String[] args) {
        squarePatternPrint(6);
    }

    /**
     * 打印所需的阵列
     *
     * @param n 输入整数 n (1 <= n <= 100)
     */
    public static void squarePatternPrint(int n) {
        int[] inits = new int[n];

        for (int i = 0, k = 0; k < n; i++) {
            if (++k <= n)
                inits[i] = k;
            if (++k <= n)
                inits[n - i - 1] = k;
        }
        for (int i : inits) {
            lmlPrint(i, n);
        }
    }

    private static void lmlPrint(int i, int n) {
        {
            int j = (i - 1) * n + 1;
            System.out.print(j);
            for (int k = 1; k < n; k++) {
                System.out.print("*" + (j + k));
            }
            System.out.println("");
        }
    }
}
