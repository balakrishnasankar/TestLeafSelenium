package testleaf.week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void printMissingElementInAnArray(int input[]) {
		Arrays.sort(input);
		int indexPointer=1;
		for (int i = 0; i < input.length; i++) {
			if (indexPointer != input[i]) {
				System.out.println("MissingElementInAnArray\t" + indexPointer);
				break;
			}
			indexPointer++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,8};
		MissingElementInAnArray.printMissingElementInAnArray(arr);
	}

}
