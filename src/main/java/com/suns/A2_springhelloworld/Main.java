package com.suns.A2_springhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Email email = (Email) applicationContext.getBean("email1");
        System.out.println(email.toString());
    }
}
