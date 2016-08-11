import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *将输入的字符串转换为Integer集合
 */
public class ConsoleToInteger {
    public static void main(String[] args) {
        String[] strs = new Scanner(System.in).nextLine().split(" ");
        List<Integer> listInt = new ArrayList<>(strs.length);
        for (String str : strs) {
            listInt.add(Integer.parseInt(str));
        }

        listInt.forEach(System.out::println);
    }
}
