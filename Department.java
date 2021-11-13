package org.department;

import org.college.College;

public class Department extends College {
	public void deptName() {
		// TODO Auto-generated method stub
		System.out.println("ENGINEERING");

	}
   public static void main(String[] args) {
	Department clg = new Department();
	clg.deptName();
	clg.collegeName();
	clg.collegeCode();
	clg.collegeRank();
	
}
}
