package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("12 inch");

	}
    public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
