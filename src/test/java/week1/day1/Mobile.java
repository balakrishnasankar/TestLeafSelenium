package week1.day1;

public class Mobile {

	public void makeCall() {
		// TODO Auto-generated method stub
System.out.println("makeCall");
	}
	
	private void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("sendMsg");
	}
	
	public static void main(String[] args) {
		Mobile mobileObj = new Mobile();
		mobileObj.makeCall();
		mobileObj.sendMsg();
	}
}
