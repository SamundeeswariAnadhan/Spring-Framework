package com.student.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Student1 s1=context.getBean(Student1.class);
		s1.show();
		Student1 s2=context.getBean(Student1.class);
		s2.show();
		
		//SpringApplication.run(Application.class, args);
	}

}
