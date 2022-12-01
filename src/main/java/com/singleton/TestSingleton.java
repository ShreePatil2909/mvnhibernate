package com.singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestSingleton {

	public static void main(String[] args) {
		
		System.out.println("Program Starts !!!");
		    
		Bank b1=new Bank(123,2000,"Shree","Kolhapur");
		Bank b2=new Bank(456,3000,"Rushi","Pune");
		Bank b3=new Bank(789,4000,"Vaibhav","Mumbai");
            
		try(SessionFactory fact=sessionUtil.getFactory();Session session=fact.openSession()){

			Transaction t=session.beginTransaction();
			session.save(b1);
			session.save(b2);
			session.save(b3);
			t.commit();
			session.close();
		}
		
		catch(Exception e) {
			System.out.println("Exception Occuredd !!");
			e.printStackTrace();
		}
		
		System.out.println("Program Ends !!!");
	}

}
