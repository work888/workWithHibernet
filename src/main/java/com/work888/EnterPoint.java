package com.work888;

import java.util.Scanner;

import org.hibernate.Session;

import com.work888.HibernateUtil;
import com.work888.User;
 
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
