package com.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionUtil {
	private static SessionFactory factory=null;

	public static SessionFactory getFactory() {

		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}
