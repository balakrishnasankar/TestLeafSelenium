package testleaf.week1.day2.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void printFindSecondLargest(int input[]) {
	Arrays.sort(input);
	System.out.println("FindSecondLargest\t"+input[input.length-2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={50,20,30,60};
		FindSecondLargest.printFindSecondLargest(input);
	}

}
