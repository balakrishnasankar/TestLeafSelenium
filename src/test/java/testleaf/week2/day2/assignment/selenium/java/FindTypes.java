package testleaf.week2.day2.assignment.selenium.java;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char input[] = test.toCharArray();
		for (int i = 0; i < input.length; i++) {
			if (Character.isDigit(input[i])) {
				num++;
			} else if (Character.isLetter(input[i])) {
				letter++;
			} else if (Character.isSpace(input[i])) {
				space++;
			} else {
				specialChar++;
			}
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
