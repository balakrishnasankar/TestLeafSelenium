package testleaf.week3.day2.selenium.classassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer input[] = {1,3,1,6,4,5,5,6,7,6};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<input.length;i++) {
			if(map.containsKey(input[i])) {
				map.put(input[i], map.get(input[i])+1);
			}else {
				map.put(input[i], 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		for(Entry<Integer, Integer> e :entry) {
			System.out.println("Entry \t"+ e.getKey() +"\toccurence  \t"+ e.getValue());
		}
	}
	
	

}
