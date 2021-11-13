package week3.day1;

public class AndroidPhone extends Mobile  {
	public void takevideo() {
		// TODO Auto-generated method stub
		System.out.println("video");

	}
	public static void main(String[] args) {
		AndroidPhone phone = new AndroidPhone();
		
		phone.takevideo();
		phone.savecontact();
		phone.sendmsg();
		phone.makecall();
		
	}

}
