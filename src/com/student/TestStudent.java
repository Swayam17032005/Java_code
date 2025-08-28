package com.student;

public class TestStudent {
    public static void main (String[] args) {
        Student s1 = new Student("Rohan", "AI", 60, 18);
        System.out.println("The name of the student is " + s1.Name);
        
        RegularStudent rs=new RegularStudent("nobita","AI",38,90,19,"h703");
        HostelStudent hs=new HostelStudent("nobita","AI",38,90,19,"h703","arya",236);
		rs.displayInfo();
		rs.payFee();
		s1.payFee();
		hs.payFee();
    }
}
