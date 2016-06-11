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
		Student student =  new Student(9999, "Siri", "MS", 4379); 
		
		emManager.persist(student);
		
		transaction.commit();
		
		emManager.close();
	}

}
