package week3.day1;


public class Calculator {

public void mul(int m1 , int m2) {
	
		int multiply = m1 * m2;
		System.out.println(multiply);
	}	
		public void mul(int m1 , double m2) {
			System.out.println(m1 * m2);
		}
		
public void sub(int s1 , int s2) {
	// TODO Auto-generated method stub
	System.out.println(s1-s2);

}
	
public void sub(double s1 , double s2) {
	// TODO Auto-generated method stub
	System.out.println(s1-s2);
	

}
public void div(int d1 ,int d2) {
	// TODO Auto-generated method stub
	System.out.println(d1/d2);

}
public void div(double d1 ,int d2) {
	// TODO Auto-generated method stub
	System.out.println(d1/d2);
}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.div(10, 20);
	cal.sub(45, 65);
	cal.sub(4568957, 452586);
	cal.mul(45, 65);
	cal.mul(10, 12354);
}
}
