package com.objis.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.objis.cache.entity.Employee;

public class FetchTest {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Session session = factory.openSession();
		Employee emp = (Employee) session.load(Employee.class, 121); 
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		session.close();
		
		Session session2 = factory.openSession();
		Employee emp2 = (Employee) session2.load(Employee.class, 121);
		System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());
		session2.close();
	}
}
