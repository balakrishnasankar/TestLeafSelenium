package myexe;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	int a[] = { 1, 1, 2, 3 };
	Set<Integer> set = new HashSet<Integer>();

	public void getDuplicate() {
		String count="";
		for (int i = 0; i < a.length; i++) {
		
			if(!set.contains(a[i])) {
			set.add(a[i]);
			System.out.println(a[i]);
			count=count+a[i];
			}
		}
		System.out.println(set.size());
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateArray obj=new RemoveDuplicateArray();
		obj.getDuplicate();
	}

}
