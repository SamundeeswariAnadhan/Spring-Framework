package com.secondproj.projecthello;

public class Student2 implements StudentInfo{
	private String Studentname;
	private int Studentid;
	private String	Department;
	private int Score;
	@Override
	public void Setmethod() 
	{
	
		Studentname = "Anandhan";
		Studentid = 124;
		Department = "BCA";
		Score =76;
       	
		
	}
	public void getmethod()
	{
	System.out.println("StudentName :"+Studentname+ "\nStudentID :"+Studentid+"\nDepartment Name : "+Department+"\nScore : "+Score);
	
    
	}

}
