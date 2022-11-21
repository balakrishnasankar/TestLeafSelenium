package testleaf.week3.day1.assignment;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println(this.getClass().getSimpleName()+"\t AxisBank deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo ab = new AxisBank();
		ab.deposit();
	}

}
