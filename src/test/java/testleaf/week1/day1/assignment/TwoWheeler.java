package testleaf.week1.day1.assignment;

public class TwoWheeler {

	public int noOfWheels = 2;
	public short noOfMirrors = 2;
	public long chassisNumber = 231234;
	public boolean isPunctured = false;
	public String bikeName = "Hero";
	public double runningKM = 55.25;

	public void printTwoWheelInfo() {
		System.out.println("noOfWheels\t" + noOfWheels);
		System.out.println("noOfMirrors\t" + noOfMirrors);
		System.out.println("chassisNumber\t" + chassisNumber);
		System.out.println("isPunctured\t" + isPunctured);
		System.out.println("bikeName\t" + bikeName);
		System.out.println("runningKM\t" + runningKM);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler twoWheeler = new TwoWheeler();
		System.out.println("Calling in side Main");
		System.out.println("noOfWheels\t" + twoWheeler.noOfWheels);
		System.out.println("noOfMirrors\t" + twoWheeler.noOfMirrors);
		System.out.println("chassisNumber\t" + twoWheeler.chassisNumber);
		System.out.println("isPunctured\t" + twoWheeler.isPunctured);
		System.out.println("bikeName\t" + twoWheeler.bikeName);
		System.out.println("runningKM\t" + twoWheeler.runningKM);
		System.out.println("Calling in Method out side main");
		twoWheeler.printTwoWheelInfo();
	}

}
