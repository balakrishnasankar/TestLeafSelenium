package testleaf.java.dailychallenge;

public class Day1LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Hello World";
		//String s = "   fly me   to   the moon  ";
		String s = "luffy is still joyboy";
		String input[]=s.split("\\s");
		System.out.println(input.length);
		System.out.println(input[input.length-1]+"\t"+input[input.length-1].length());
		int index = s.lastIndexOf(" ");
		System.out.println(s.substring(index+1).length());
	}

}
