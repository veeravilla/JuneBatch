package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Address;
import com.test.beans.Course;
import com.test.beans.ReferenceData;
import com.test.beans.Student;

public class SpringApp {

	public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("collectionApplicationContext.xml"); //("applicationContext.xml");
		
		ReferenceData ref = springContainer.getBean(ReferenceData.class);
		
		//Student student = springContainer.getBean("student",Student.class);
		
//		Student student1 = springContainer.getBean("student1",Student.class);
		/*Address address = springContainer.getBean(Address.class);
		
		Address address1 = springContainer.getBean(Address.class);
		
		Address address2 = springContainer.getBean(Address.class);
		
		Course course = springContainer.getBean(Course.class);*/
		
		//System.out.println("Address " + address);
		
		//System.out.println("Course " + course);
		
		System.out.println(ref);

	}

}
