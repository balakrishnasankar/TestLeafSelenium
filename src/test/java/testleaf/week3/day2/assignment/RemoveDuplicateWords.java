package testleaf.week3.day2.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String input[]=text.split("\\s+");
		Set<String> set = new LinkedHashSet<String>();
		for(String i:input) {
			set.add(i);
		}
		
		for(String s :set) {
			System.out.print(s+" ");
		}
	}

}
