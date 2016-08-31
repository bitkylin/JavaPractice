package squarepattern;

public class squarePattern {
    public static void main(String[] args) {
        squarePatternPrint(9);
    }

    public static void squarePatternPrint(int n) {
        squarePattern squarePattern = new squarePattern();
        squarePattern.compute(1, n);
    }

    private static void lmlPrint(int i, int n) {
        {
            int j = i * n + 1;
            System.out.print(j);
            for (int k = 1; k < n; k++) {
                System.out.print("*" + (j + k));
            }
            System.out.println("");
        }
    }

    private static void compute(int i, int n) {
        lmlPrint(i - 1, n);
        if ((i + 1) < n && (i + 2) != n)
            compute(i + 2, n);
        else if ((i + 2) == n)
            lmlPrint(i + 1, n);
        lmlPrint(i, n);
    }
}
