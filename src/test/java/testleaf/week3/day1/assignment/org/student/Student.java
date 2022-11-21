package testleaf.week3.day1.assignment.org.student;

import testleaf.week3.day1.assignment.org.collage.College;
import testleaf.week3.day1.assignment.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println(this.getClass().getSimpleName()+"\ttudentName");
	}
	
	public void studentDept() {
		System.out.println(this.getClass().getSimpleName()+"\tstudentDept");
	}
	
	public void studentId() {
		System.out.println(this.getClass().getSimpleName()+"\tstudentId");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}

}
