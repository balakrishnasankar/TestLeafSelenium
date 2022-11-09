package testleaf.week1.day2.assignment;

public class FindIntersection {

	public static void printFindIntersection(int fristArray[],int secondArray[]) {
		
		for(int i=0;i<fristArray.length;i++) {
			for(int j=0;j<secondArray.length;j++) {
				if(fristArray[i]==secondArray[j]) {
					System.out.println("FindIntersection Elements\t"+fristArray[i]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  fristArray[]= {2,3,11,4,6,7};
		int  secondArray[]= {1,2,8,4,9,7};
		FindIntersection.printFindIntersection(fristArray, secondArray);
	}

}
