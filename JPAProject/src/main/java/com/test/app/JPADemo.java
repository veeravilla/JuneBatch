package com.test.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.test.pojo.Student;

public class JPADemo {
	
	public static void main(String a[]){
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager emManager = emFactory.createEntityManager();
		
		EntityTransaction transaction = emManager.getTransaction();
		
		transaction.begin();

		//DB Operations
		//INSERT
		//Student student =  new Student(7777, "Tao", "MS", 3783); 
		
		//emManager.persist(student);
	
		//Read
		Student student1  = emManager.find(Student.class, 7777);
		//student1.setSname("Tao123"); //Update
		
		//Student student2  = emManager.find(Student.class, 7777);
		
		//System.out.println(student1);
		
		//System.out.println(student2);
		//Student student1 = new Student(7777);
		emManager.remove(student1);
		
		transaction.commit();
		
		emManager.close();
	}

}
