package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("NAVYA");

	}
	public void studentID() {
		// TODO Auto-generated method stub
		System.out.println("55");
}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("CSE");
	}
	public static void main(String[] args) {
		Student details = new Student();
		details.studentName();
		details.deptName();
		details.studentDept();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.studentID();
		
		
	}
}