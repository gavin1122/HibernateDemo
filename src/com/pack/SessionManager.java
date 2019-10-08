package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionManager {
	
	public static Session getSession()
	
	{
		
	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata metadata= new MetadataSources(registry).buildMetadata();
	SessionFactory factory= metadata.buildSessionFactory();
	Session session=factory.openSession();
	return session;
	}
	

}
