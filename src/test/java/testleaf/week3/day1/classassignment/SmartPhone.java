package testleaf.week3.day1.classassignment;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {
		System.out.println("From SmartPhone connectWhatsApp");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		AndroidPhone ap = new AndroidPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.connectWhatsApp();
		ap.connectWhatsApp();
	}

}
