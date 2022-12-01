package com.mvnhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDB {

	public static void main(String[] args) {
		System.out.println("Main Started..!!");
		
		BankData bd1 = new BankData(92818210, "Shree", "Kop");
		BankData bd2 = new BankData(92882100, "Krishna", "UP");
		BankData bd3 = new BankData(93657892, "Ram", "Shrilanka");
		BankData bd4 = new BankData(93568725, "Sham", "Punes");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.save(bd1);
		session.save(bd2);
		session.save(bd3);
		session.save(bd4);

		t.commit();
//		session.close();

		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3);
		System.out.println(bd4);
	 System.out.println("Main Ended..!!");
	}

}
