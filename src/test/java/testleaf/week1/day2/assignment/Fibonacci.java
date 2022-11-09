package testleaf.week1.day2.assignment;

public class Fibonacci {

	public static void printFibonacci (int n) {
		int firstNum = 0, secNum = 1, sum ;
		System.out.print(firstNum);
		for(int i=1;i<n;i++) {
			sum=firstNum+secNum;
			System.out.print(","+sum);
			firstNum=secNum;
			secNum=sum;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci.printFibonacci(8);
	}

}
