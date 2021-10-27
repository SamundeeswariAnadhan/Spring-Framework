package com.student.Application;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mechanical implements Department {

	
	public void subject() {
		System.out.println("********Mechanical*******");
		System.out.println("Physics");
		System.out.println("Chemistry");
		System.out.println("Maths");

	}

}
