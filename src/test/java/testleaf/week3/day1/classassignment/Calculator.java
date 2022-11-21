package testleaf.week3.day1.classassignment;

public class Calculator {

	public void add(int a,int b,int c) {
		System.out.println("add with 3 argument\t"+ a+b+c);
	} 
	
	public void add(int a,int b) {
		System.out.println("add with 2 argument\t"+ a+b);
	} 
	
	public void sub(double a,double b) {
		System.out.println("add with 2 argument double\t" + (a - b));
	} 
	
	public void sub(int a,int b) {
		System.out.println("add with 2 argument int\t"+( a-b));
	} 
	
	public void mul(double a,double b) {
		System.out.println("add with 3 argument\t"+ a*b);
	} 
	
	public void mul(int a,int b) {
		System.out.println("add with 2 argument\t"+ a*b);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		c.add(5,5);
		c.add(2, 2, 2);
		c.sub(5, 2);
		c.sub(4.5, 3.5);
		c.mul(3.5, 5.5);
		c.mul(2, 3);
	}

}
