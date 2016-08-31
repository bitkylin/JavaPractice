package consoleinput;

import java.util.Scanner;

/**
 * 控制台输入n个数字
 */
public class inputNum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入数字数量：");
        int numCount = scanner.nextInt();
        int[] nums = new int[numCount];

        System.out.println("请输入" + numCount + "个数字：");
        for (int i = 0; i < numCount; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("您输入的" + numCount + "个数字分别为：");

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}