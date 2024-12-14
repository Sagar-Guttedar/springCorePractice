package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEmployeeTest {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring-config.xml");

        Employee e= (Employee)ap.getBean("emp");
        System.out.println("Employee Detailes : "+e.toString());
    }
}
