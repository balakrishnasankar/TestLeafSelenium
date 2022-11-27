package testleaf.week3.day2.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abbabab";

		char[] ch = input.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		int max = 0;
		Character ch1 = null;
		Set<Entry<Character, Integer>> entry = map.entrySet();
		for (Entry<Character, Integer> e : entry) {

			if (e.getValue() > max) {
				max = e.getValue();
				ch1=e.getKey();
			}
		}
		System.out.println(ch1);
		System.out.println(max);
	}

}
