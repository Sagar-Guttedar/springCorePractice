package com.joct;

public class Student {

    int sid;
    String sname;
    float fees;
    Address add;

    public Student(){
        System.out.println("Hi all, im a no argumented constructor");
    }
    public Student(int sid){
        this.sid = sid;
        System.out.println("Integer constructor");
    }

    public Student(String sname){
        this.sname = sname;
        System.out.println("String constructor");
    }
    public Student(int sid, String sname){
        this.sid = sid;
        this.sname = sname;
    }
    public Student(int sid, String sname, float fees){
        this.sid = sid;
        this.sname = sname;
        this.fees = fees;
        System.out.println("Hi all, im a argumented constructor");
    }

    public Student(int sid, String sname, float fees, Address add){
        this.sid = sid;
        this.sname = sname;
        this.fees = fees;
        this.add = add;
    }

    public String toString(){
        System.out.println("House No : "+add.getHno()+" State : "+add.getState()+" City : "+add.city);
        return "Student Id : "+sid+" Student Name : "+sname+" Student Fees : "+fees;
    }

}