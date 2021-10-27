package com.student.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public class Student1 {
	
	@Autowired
	
	Department dep;
	
	public Department getMark() {
		return dep;
	}

	public void setMark(Department dep) {
		this.dep = dep;
	}

	public void show()
	{
		System.out.println("Student name=Samundeswari ");
		System.out.println("Student id = 123");
		dep.subject();
	}

}
