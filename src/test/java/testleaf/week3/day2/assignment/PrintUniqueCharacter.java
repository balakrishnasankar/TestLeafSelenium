package testleaf.week3.day2.assignment;

import java.util.HashSet;

public class PrintUniqueCharacter {

	public static void findPrintUniqueCharacter(char input[]) {
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();
		for (char c : input) {
			if (set.contains(c)) {
				set.remove(c);
				duplicate.add(c);
			} else {
				if(!duplicate.contains(c)) {
				set.add(c);
				}
			}
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "babuba";
		char input1[] = input.toCharArray();
		PrintUniqueCharacter.findPrintUniqueCharacter(input1);
	}

}
