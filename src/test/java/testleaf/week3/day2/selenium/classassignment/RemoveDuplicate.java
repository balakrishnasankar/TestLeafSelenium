package testleaf.week3.day2.selenium.classassignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String compantName="google";
		Set<Character> cset = new HashSet<Character>();
		char [] charCompany =compantName.toCharArray();
		for(char ch : charCompany) {
			cset.add(ch);
		}
		for(char ch : cset) {
			System.out.print(ch);
		}
	}

}
