package com.hibernate._first_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class getandloadmethod {

	public static void main(String[] args) {

		
			System.out.println("project start");

			Configuration cfg = new Configuration();
			cfg.configure("config.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();

			Session session = factory.openSession();
		
			Student st = session.get(Student.class, 101);
			System.out.println(st);
			System.out.println(st.getCity()+" "+st.getName()+" "+st.getSid());

			//condition check show ing null
			
			/* Student st1 = (Student)session.get(Student.class, 108);
			 System.out.println(st1);
			 System.out.println(st1.getCity()+" "+st1.getName()+" "+st1.getSid());
			 */
			Student st2 = session.load(Student.class, 104);
			System.out.println(st2.getCity()+" "+st2.getName()+" "+st2.getSid());

			//condition check show ing nullexection
		
			  Student st3 = session.get(Student.class, 108);
			  System.out.println(st3.getCity()+" "+st3.getName()+" "+st3.getSid());
			 System.out.println(st3);
			
			session.close();
			factory.close();

		
	}

}
