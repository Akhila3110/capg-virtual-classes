package com.capg.labbook;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory factory=Persistence.createEntityManagerFactory("CapgAuthor");
       EntityManager em=factory.createEntityManager();
       EntityTransaction tx=em.getTransaction();
       
       Author a1=new Author(1,"K","Akhila","chitti",12345);
       Author a2=new Author(2,"M","Sowjanya","sree",67890);
       Author a3=new Author(3,"Y","Sai","chinnu",54321);
       Author a4=new Author(4,"K","Sri","nidhi",96409);
       tx.begin();
       em.persist(a1);
       em.persist(a2);
       em.persist(a3);
       em.persist(a4);
       tx.commit();
       System.out.println("author details inserted..");
     
       // delete
//       tx.begin();
//       em.remove(a3);
//       tx.commit();
//       System.out.println("Details...!!");
      
       TypedQuery<Author> query= em.createQuery("from Author",Author.class);
   	List<Author> allStudents=query.getResultList();
   	 allStudents.forEach(s->System.out.println(s));
       
    }
}
