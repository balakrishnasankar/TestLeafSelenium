package testleaf.week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargestInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 50, 20, 30, 60 };
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			set.add(input[i]);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("FindSecondLargestInCollection\t" + list);
		System.out.println("FindSecondLargestInCollection\t" + list.get(list.size() - 2));
	}

}
