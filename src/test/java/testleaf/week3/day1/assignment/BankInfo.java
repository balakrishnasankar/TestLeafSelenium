package testleaf.week3.day1.assignment;

public class BankInfo {

	public void saving() {
		System.out.println(this.getClass().getSimpleName()+"\tsaving");
	}
	
	public void fixed() {
		System.out.println(this.getClass().getSimpleName()+"\tfixed");
	}
	
	public void deposit() {
		System.out.println(this.getClass().getSimpleName()+"\t BankInfo deposit");
	}
}
