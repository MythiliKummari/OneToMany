package com.mythili2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mythili2.model.Address;
import com.mythili2.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
         Session session=sessionFactory.openSession();
         
         try 
         {
         Address address=new Address();
         address.setName("Hyderabad");
         
         Person person1=new Person();
         person1.setName("Anil Kumar");
         person1.setAddress(address);
         
         Person person2=new Person();
         person2.setName("Raj");
         person2.setAddress(address);
         
         address.getPerson().add(person1);
         address.getPerson().add(person2);
         session.beginTransaction();
         session.save(address);
         session.getTransaction().commit();
         }
         finally 
         {
         	session.close();
         	sessionFactory.close();
         }
       }
 }



