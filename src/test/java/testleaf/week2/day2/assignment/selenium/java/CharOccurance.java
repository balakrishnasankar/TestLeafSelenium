package testleaf.week2.day2.assignment.selenium.java;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char searchItem ='e';
		int count=0;
		char input[] =str.toCharArray();
		for(int i=0;i<input.length;i++) {
			
			if(input[i]==searchItem) {
				count++;
			}
		}
		System.out.println(searchItem+"\tCharOccurance is "+count);
	}
}
