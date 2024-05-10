package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
    public static void main(String[] args) {
        // Creating SessionFactory instance
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        // Opening session
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        
        
         //fetch
//       Query q = session.createQuery("from Teacher where id = 12 ");
        //delete
//        Query q = session.createQuery(" delete from Teacher where id = 12 ");
        //update
        Query q = session.createQuery(" update Teacher set name ='varshaSharmistha' where id=14");
        int result = q.executeUpdate();
        System.out.println(result);
//       //unique, list
//       List<Teacher> l = q.list();
//       
//       for(Teacher t:l)
//       {
//    	   System.out.println(t);
//       }
        // Closing session
        session.close();
        tr.commit();
        
        // Closing SessionFactory
        sessionFactory.close();
    }
}
