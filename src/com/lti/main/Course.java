package com.lti.main;

public class Course {
	int cid;
	String cname;
	float fees;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, float fees) {
		
		System.out.println("Enter the details(course_id, name and fees)");
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	
	
	

	
}
