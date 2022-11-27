package testleaf.week3.day2.assignment;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i])) {
				map.put(input[i],map.get(input[i])+1);
			} else {
				map.put(input[i], 1);
			}
		}
		
		Set<Entry<Integer, Integer>> e =map.entrySet();
		for(Entry<Integer, Integer> entry : e) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		Set<Integer> e1 =map.descendingKeySet();
		for(Integer entry : e1) {
			System.out.println(entry+"\t"+map.get(entry));
		}
	}
}
