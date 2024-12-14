package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStudentTest {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring-config.xml");
        Student st = (Student)ap.getBean("stu");
        System.out.println("Student id : "+ st.getSid()+" Student Name : "+st.getSname()+" Student Fees : "+st.getFees());
    }
}
