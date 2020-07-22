package com.hibernate._first_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {

		System.out.println("project start");

		Configuration cfg = new Configuration();
		cfg.configure("config.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student st = new Student();
		st.setSid(101);
		st.setName("ritesh");
		st.setCity("kota");
		System.out.println(st);

		Student st1 = new Student();
		st1.setSid(102);
		st1.setName("suresh");
		st1.setCity("jaipur");
		System.out.println(st1);

		Student st2 = new Student();
		st2.setSid(103);
		st2.setName("mahesh");
		st2.setCity("delhi");
		System.out.println(st2);

		Student st3 = new Student();
		st3.setSid(104);
		st3.setName("kapile");
		st3.setCity("kolkata");
		System.out.println(st3);

		session.save(st);
		session.save(st1);
		session.save(st2);
		session.save(st3);
		tx.commit();

		session.close();
		factory.close();

	}

}
