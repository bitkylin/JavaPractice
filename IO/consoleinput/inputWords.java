package consoleinput;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 控制台输入n个单词或数字
 */
public class inputWords {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请数入n个单词或数字：");
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("转化为数字吗？[y/n]");
        if (scanner.nextLine().equals("y")) {
            List<Integer> list = new ArrayList<>();
            for (String s : strings) {
                list.add(Integer.parseInt(s));
            }
            list.forEach(System.out::println);
        }
    }
}
