package testleaf.week3.day1.assignment;

public class Students {

	public void getStudentInfo(int studentId) {
		System.out.println("getStudentInfo with 1 argument");
	}
	
	public void getStudentInfo(int studentId,String name) {
		System.out.println("getStudentInfo with 2 argument");
	}
	
	public void getStudentInfo(int studentId,String name,int rollNumber) {
		System.out.println("getStudentInfo with 3 argument");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s= new Students();
		s.getStudentInfo(20);
		s.getStudentInfo(20, "testb");
		s.getStudentInfo(20, "testb", 2020);
	}

}
