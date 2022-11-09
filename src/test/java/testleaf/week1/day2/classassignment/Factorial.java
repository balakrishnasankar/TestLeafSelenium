package testleaf.week1.day2.classassignment;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=115;
		int fact =1;
		for(int i=1;i<=input;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of\t"+input+"\tis\t"+fact);
	}

}
