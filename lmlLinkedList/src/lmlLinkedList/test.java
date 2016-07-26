package lmlLinkedList;

import java.util.ArrayList;
import java.util.List;

public class test {

	int a;
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(10);
		System.out.println(nums.size());
		System.out.println(nums.get(0));
		System.out.println("---");
		
		
		LmlLindedList lindedNums = new LmlLindedList();
		lindedNums.add(6);
		lindedNums.add(4);
		lindedNums.add(2);
		System.out.println(lindedNums.size());
		System.out.println(lindedNums.get(0)+"+"+lindedNums.get(1)+"+"+lindedNums.get(2));

		
		try {
			System.out.println("---");
			lindedNums.getAll();
			System.out.println("---");
			lindedNums.remove(2);
			lindedNums.getAll();
			System.out.println("---");
			lindedNums.remove(1);
			lindedNums.getAll();
			System.out.println("---");
			lindedNums.remove(1);
			lindedNums.getAll();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("³ö´í£¡£¡£¡");
			//e.printStackTrace();
		}
		
	}
	int getlml(){
		return a;
	}

}
