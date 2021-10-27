package com.secondproj.projecthello;


public class Student implements StudentInfo {
	private String Studentname;
	private int Studentid;
    private String	Department;
    @Override
	public void Setmethod()
	{
		this.Studentname="Samu";
		this.Studentid=123;
		this.Department="MCA";
		
	}
	
public void getmethod()
{
	System.out.println("StudentName :"+Studentname+ "\nStudentID :"+Studentid+"\nDepartment Name : "+Department);
}



}
