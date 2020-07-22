package com.hibernate.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		 
		
		Configuration conf=new Configuration();
		conf.configure("config.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Question q1= new Question();
		q1.setQid(101);
		q1.setQuestion("what is java");
		Answer ans= new Answer();
		ans.setAnswerid(301);
		ans.setAnswer("java is projraming langauge");
		q1.setAnswer(ans);
		
		Question q2= new Question();
		q2.setQid(102);
		q2.setQuestion("what is c");
		Answer ans1= new Answer();
		ans1.setAnswerid(302);
		ans1.setAnswer("c is programing langauge");
		q2.setAnswer(ans1);
		
		
		session.save(q1);
		session.save(q2);
		session.save(ans);
		session.save(ans1);
		tx.commit();
		
		session.close();
		factory.close();
				
				
		

	}

}
