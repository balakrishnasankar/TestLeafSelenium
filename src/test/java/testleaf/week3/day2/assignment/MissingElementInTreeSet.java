package testleaf.week3.day2.assignment;

import java.util.TreeSet;

public class MissingElementInTreeSet {

	public static void findMissingNumber(TreeSet<Integer> treeset) {
		int j = 1;
		for (Integer i : treeset) {
			if (i != j) {
				System.out.println("Missing No\t" + i);
			}
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(2);
		treeset.add(1);
		treeset.add(4);
		treeset.add(6);
		MissingElementInTreeSet.findMissingNumber(treeset);
	}

}
