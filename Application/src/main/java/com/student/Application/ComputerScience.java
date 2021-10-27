package com.student.Application;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component

public class ComputerScience implements Department {
	
	public void subject()
	{
	   System.out.println("********Computer Science*******");
       System.out.println("Java");
       System.out.println("C++");
       System.out.println("C language");
	
	}
}
