package arraysortquantity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 对输入的数组进行排序，排序规则：
 * 按数组中元素出现的次数进行排序，出现次数多的元素排在前面
 */
public class ArraySortQuantity {
    public static void main(String[] args) {
        int[] resultNums = ArraySort(new int[]{6, 1, 22, 22, 22, 22, 22, 22, 3, 3, 2, 1, 2, 12, 12, 12, 12, 12, 12, 1, 22, 22, 3, 3, 5, 5, 7});
        for (int i : resultNums) {
            System.out.println(i);
        }
    }

    /**
     * 按数组中元素出现的次数进行排序，出现次数多的元素排在前面
     *
     * @param nums 输入的原始数组
     * @return 已排序的数组
     */
    public static int[] ArraySort(int[] nums) {
        int[] resultNums = new int[nums.length];

        //局部内部类，对需排序的元素进行封装
        class Item {
            private int value;
            private int count;

            private Item(int value, int count) {
                this.value = value;
                this.count = count;
            }
        }
        List<Item> items = new ArrayList<>();

        //将数组元素封装进集合中
        for (int num : nums) {
            Boolean isNew = true;
            for (Item item : items) {
                if (item.value == num) {
                    item.count++;
                    isNew = false;
                }
            }
            if (isNew)
                items.add(new Item(num, 1));
        }

        //对集合按照指定规则进行排序
        items.sort(new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                if (item2.count > item1.count)
                    return 1;
                else
                    return -1;
            }
        });

        //将集合转化为相应的数组
        for (int i = 0; i < resultNums.length; ) {
            for (Item item : items) {
                for (int j = 0; j < item.count; j++) {
                    resultNums[i] = item.value;
                    i++;
                }
            }
        }
        return resultNums;
    }
}
