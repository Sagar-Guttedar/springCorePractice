package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring-config.xml");

        Question q=(Question)ap.getBean("qu");

        System.out.println("Question Id : "+q.getQid()+" Question Name : "+q.getQname()+" Answer : "+q.getAnswer());
    }
}
