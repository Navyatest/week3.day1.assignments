package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectwhatsapp() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp");
		

	}
	public void takevideo() {
		// TODO Auto-generated method stub
		System.out.println("TOOK VIDEO");
	}

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.connectwhatsapp();
		sm.takevideo();
		sm.savecontact();
		sm.sendmsg();
		sm.makecall();
		
	}
}
