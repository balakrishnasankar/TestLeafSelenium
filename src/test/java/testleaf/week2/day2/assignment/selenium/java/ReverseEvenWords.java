package testleaf.week2.day2.assignment.selenium.java;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		int j = 1;
		String rev = "";
		String inputArray[] = test.split("\\s");
		for (int i = 0; i <= inputArray.length - 1; i++) {
			if (j % 2 == 0) {
				rev = rev + ReverseEvenWords.reverseWord(inputArray[i]);
			} else {
				rev = rev + inputArray[i];
			}
			j++;
		}
		System.out.print(rev);
	}

	public static String reverseWord(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}
