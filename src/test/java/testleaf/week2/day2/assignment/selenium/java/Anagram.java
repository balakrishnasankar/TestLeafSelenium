package testleaf.week2.day2.assignment.selenium.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		char input1[] = text1.toCharArray();
		char input2[] = text2.toCharArray();
		Arrays.sort(input1);
		Arrays.sort(input2);
		if (input1.length == input2.length && Arrays.equals(input1, input2)) {

			System.out.println("Anagram");
		} else {
			System.out.println("not Anagram");
		}
	}

}
