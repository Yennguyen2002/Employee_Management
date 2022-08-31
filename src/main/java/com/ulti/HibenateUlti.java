package com.ulti;

import org.hibernate.SessionFactory;

public class HibenateUlti {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return sessionFactory;
	}
	

}
