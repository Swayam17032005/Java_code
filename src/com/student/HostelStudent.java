package com.student;

public class HostelStudent extends RegularStudent{
	String hostel_name;
	int room_no;
	
	public HostelStudent(String Name, String Department, int Rollno, int Age,int attendance_per,String class_room,String hostel_name,int room_no) {
		super(Name,Department,Rollno,Age,attendance_per,class_room);
		this.hostel_name=hostel_name;
		this.room_no=room_no;
		
		
		
	}
	public void payFee() {
		System.out.println("the student "+Name+" paid the tution fee+library fee+lab fee + hostel fee");
		
	}
	
	

}
