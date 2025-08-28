package com.student;

public class Student {
    String Name;
    String Department;
    int Rollno;
    int Age;

   
    public Student(String Name, String Department, int Rollno, int Age) {
        this.Name = Name;
        this.Department = Department;
        this.Rollno = Rollno;
        this.Age = Age;
    }

 
    public Student() {
        this.Name = null;
        this.Department = null;
        this.Rollno = 0;
        this.Age = 0;
    }
     public void Search(int Rollno) {
    	 System.out.println("search by rollno "+ Rollno);
    }
     
     public void Search(String Name,int Rollno) {
    	 System.out.println("search by name and roll"+Name+Rollno);
     }
     public void Search(int Rollno,String Name) {
    	 System.out.println("search by roll no and name"+Rollno+Name);
    	 
    	 
    	 
     }
     public void Search(String name,String Department) {
    	 System.out.println("search by name and departemnt"+Name+Department);
    	 
     }
     
     
	 


    public void studying(int No_of_hours) {
        System.out.println("The student " + Name + " is studying for " + No_of_hours + " hours");
    }

    public void readAndwrite() {
        System.out.println("The student can read and write");
    }

    static String Collegename = "KIET";

    public void displayInfo() {
        System.out.println("Student name is " + Name + 
                           " , Age is " + Age + 
                           ", RollNo is " + Rollno + 
                           ", Department is " + Department);
    }
    public void payFee() {
    	System.out.println("The studenet "+ Name+" paid the tution Fee");
    }
   

    public static void main(String args[]) {
        // Using parameterized constructor
        Student student1 = new Student();
        
        student1.Search(56);
        student1.Search(70, "Nobita");
        student1.Search("kiet", 58);
        student1.Search("Nobita", "AI");
        
//        student1.displayInfo();

//        // Using default constructor
//        Student student2 = new Student();
//        student2.Name = "Nobita";
//        student2.Age = 19;
//        student2.Department = "CSE-AI";
//        student2.Rollno = 25;
//        student2.displayInfo();

        // Static variable example
//        System.out.println("CollegeName is " + Student.Collegename);
//        Student.Collegename = "IIT GZB";
//        System.out.println("CollegeName after change: " + Student.Collegename);
    }
}
