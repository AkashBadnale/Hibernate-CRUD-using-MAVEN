package com.ab.hibernateBasic;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *  performing  insert , select , update  , delete
 *  insert  ---   session.save(object);
 *  select  ---   session.createQuery(" from EntityClassName ").getResultList();
 *  update --    session.update(object);
 *  delete  ---   session.delete(object);
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
    	SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
    	
        /*    code to add new Student   */ 
        
    	/*Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(new Student(1,"A","B",25));
        session.save(new Student(2,"N","K",26));
        session.save(new Student(3,"P","K",26));
        session.save(new Student(4,"A","P",27));
        session.save(new Student(5,"T","L",25));
        session.save(new Student(6,"P","Q",20));
       
        session.flush();
        tx.commit();*/
    	
    	/*  code to fetch all the data from table */
    	
    	/*List<Student>  listOfStudents  =  new ArrayList<>();
    	Session session = sessionFactory.openSession();
    	Transaction  tx = session.beginTransaction();
    	                                     // HQL query using className to fetch data
    	listOfStudents = session.createQuery("from Student").getResultList();
    	
    	for(Student  student : listOfStudents) {
    		System.out.println("Id --"+student.getId()+"  Name --"+student.getName()+" Surname --"+student.getSurname()+" Age --"+student.getAge());
    	}//for
        
    	// code to fetch specific data using Id    	
        Student st = (Student) session.get(Student.class, 1);
        System.out.println(st);

    	session.flush();
    	tx.commit();
    	session.close();*/
    	
    	/*  code to update the student information */
    	/*Student st = new Student(1,"Adi","B",21);
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.update(st);
    	session.flush();
    	tx.commit();
    	session.close();*/
    	
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	                                                                    // we are specifying particular id 
    	Student student = session.load(Student.class, new Integer(5));
    	session.delete(student);
    	session.flush();
    	tx.commit();
    	session.close();
    }//main
}//Test
