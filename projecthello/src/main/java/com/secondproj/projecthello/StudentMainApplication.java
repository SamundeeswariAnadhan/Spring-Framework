package com.secondproj.projecthello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainApplication
{
      public static void main(String[] args)
	{
		
       ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
	  
		StudentInfo obj=(StudentInfo)context.getBean("stu");
		
		obj.Setmethod();
	   
	    
	   //Student3 obj=(Student3)context.getBean("stu");
	
	    obj.getmethod();
	
	}
}
