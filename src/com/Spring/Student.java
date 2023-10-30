

package com.Spring;
public class Student {

	
	private String Student;

	/**
	 * @return the student
	 */
	public String getStudent() {
		return Student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(String student) {
		Student = student;
	}
	
	public void displayinfo(){
		System.out.print("hello: "+Student);
		
	}
}
