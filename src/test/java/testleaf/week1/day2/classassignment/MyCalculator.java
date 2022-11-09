package testleaf.week1.day2.classassignment;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("ADD\t"+cal.add(10, 20, 30));
		System.out.println("SUB\t"+cal.sub(50, 60,70));
		System.out.println("MUL\t"+cal.mul(20.35, 10.45));
		System.out.println("DIV\t"+cal.divide(10.0f, 5.0f));
	}

}
