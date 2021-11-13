package week3.day1;

public class StringCamparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Kutty");
		 String str2 = new String("Kutty");
		 if(str1==str2) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
	}
	
	/*
	 * if(str1.equals(str2)) 
	 * { 
	 * System.out.println(" Same text"); }
	 *  else
	 * System.out.println("Diff text");
	 * 
	 * 
	 * }
	 */
   // ans : diff text (because == campares memory location)
}
