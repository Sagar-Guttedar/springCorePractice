package com.joct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        /*Student s=(Student) ctx.getBean("st");
        System.out.println(s.toString());*/
        Question qu =(Question) ctx.getBean("q");
        qu.display();
    }
}

