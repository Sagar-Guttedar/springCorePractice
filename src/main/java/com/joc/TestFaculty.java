package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFaculty {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring-config.xml");

        Faculty f=(Faculty) ap.getBean("f");
        System.out.println("Faculty id : "+f.getFid()+" Faculty Name : "+f.getFname()+" Salary : "+f.getSalary());

        System.out.println("House No : "+f.getAdd().getHno()+" City : "+f.getAdd().getCity()+" State : "+f.getAdd().getState());
    }
}
