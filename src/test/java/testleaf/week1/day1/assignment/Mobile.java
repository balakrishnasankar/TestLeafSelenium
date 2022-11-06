package testleaf.week1.day1.assignment;

public class Mobile {

	public String mobileBrandName ="VIVO";
	public char mobileLogo='@';
	public short noOfMobilePiece=2;
	public int modelNumber=34521;
	public long mobileImeiNumber=56434657654L;
	public float mobilePrice=11000.0f;
	public boolean isDamaged=false;
	
	public void getMobileInfo() {
		System.out.println("mobileBrandName\t" + mobileBrandName);
		System.out.println("mobileLogo\t" + mobileLogo);
		System.out.println("noOfMobilePiece\t" + noOfMobilePiece);
		System.out.println("modelNumber\t" + modelNumber);
		System.out.println("mobileImeiNumber\t" + mobileImeiNumber);
		System.out.println("mobilePrice\t" + mobilePrice);
		System.out.println("isDamaged\t" + isDamaged);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile= new Mobile();
		System.out.println("Calling in side Main");
		System.out.println("mobileBrandName\t" + mobile.mobileBrandName);
		System.out.println("mobileLogo\t" + mobile.mobileLogo);
		System.out.println("noOfMobilePiece\t" + mobile.noOfMobilePiece);
		System.out.println("modelNumber\t" + mobile.modelNumber);
		System.out.println("mobileImeiNumber\t" + mobile.mobileImeiNumber);
		System.out.println("mobilePrice\t" + mobile.mobilePrice);
		System.out.println("isDamaged\t" + mobile.isDamaged);
		System.out.println("Calling in Method out side main");
		mobile.getMobileInfo();
	}

}
