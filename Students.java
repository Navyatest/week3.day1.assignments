package week3.day1;

public class Students {
	
	public void getStudentInfo(int stuId) {
		// TODO Auto-generated method stub
		System.out.println("Student Id  " +stuId);
	}
	public void getStudentInfo(int stuId, String stuName) {
		// TODO Auto-generated method stub
		System.out.println("Student Name and Id "+ stuId    + stuName);
	}	
	public void getStudentInfo(String stuEmail,int stuPh) {
		// TODO Auto-generated method stub
		System.out.println("Student Email and PH  " + stuEmail  + stuPh);
		
	}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(4);
		info.getStudentInfo(6 ," NAVYA");
		info.getStudentInfo("nav@gmail.com " , 854261455);
		
	}
	

}
