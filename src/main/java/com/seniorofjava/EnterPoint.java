package com.seniorofjava;

import java.util.Scanner;

import org.hibernate.Session;

import com.seniorofjava.HibernateUtil;
import com.seniorofjava.User;
 
public class EnterPoint {
 
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Scanner scanner = new Scanner(System.in);
        session.beginTransaction();
        User user = new User();
       
        
       
        user.setFirstName(scanner.nextLine());
        user.setLastName(scanner.nextLine());
        
        
        
        
 
        session.save(user);
       
        session.getTransaction().commit();
        
    }
 
}
