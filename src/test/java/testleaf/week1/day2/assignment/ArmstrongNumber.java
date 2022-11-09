package testleaf.week1.day2.assignment;

public class ArmstrongNumber {

	public static void printArmstrongNumber(int input) {
		int calculated = 0;
		int remainder, original;
		original = input;
		while (input > 0) {
			remainder = input % 10;
			calculated = calculated + (remainder * remainder * remainder);
			input = input / 10;
		}
		if (original == calculated) {
			System.out.println("Yes. It is Armstrong No.");
		} else {
			System.out.println("No. It is not an Armstrong No.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber.printArmstrongNumber(153);
	}

}
