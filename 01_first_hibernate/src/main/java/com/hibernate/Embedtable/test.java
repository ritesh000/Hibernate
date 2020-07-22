package com.hibernate.Embedtable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
	
		
		Configuration conf=new Configuration();
		conf.configure("config.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		student st=new student();
		st.setSid(101);
		st.setSname("ritesh");
		st.setSsection("a1");
		address ad=new address();
		ad.setCity("kota");
		ad.setHome_number("01b32");
		ad.setStreet("mahaveernager1");
		st.setAddres(ad);
		student st1=new student();
		st1.setSid(102);
		st1.setSname("deepak");
		st1.setSsection("b2");
		address ad1=new address();
		ad1.setCity("delhi");
		ad1.setHome_number("012skjdk");
		ad1.setStreet("dehav nager");
		st1.setAddres(ad1);
		
		student st2=new student();
		st2.setSid(103);
		st2.setSname("kapile");
		st2.setSsection("c3");
		address ad2=new address();
		ad2.setCity("mumbi");
		ad2.setHome_number("kp2123");
		ad2.setStreet("firstnavi nager");
		st2.setAddres(ad2);
		
		session.save(st);
		session.save(st1);
		session.save(st2);
		
	
		tx.commit();
		session.close();
		factory.close();
		
		

	}

}
