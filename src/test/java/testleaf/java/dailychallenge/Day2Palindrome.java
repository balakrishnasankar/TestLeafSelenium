package testleaf.java.dailychallenge;

public class Day2Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbac";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		Day2Palindrome.method2(str);
	} 

	public static void method2(String str) {
		int i = 0;
		int j = str.length() - 1;
		boolean flag = true;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}

	public static void method1(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}

}
