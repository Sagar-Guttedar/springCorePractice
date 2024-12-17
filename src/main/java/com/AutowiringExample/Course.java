package com.AutowiringExample;

public class Course {

    int cid;
    String cname;
    float fees;

    public Course(int cid, String cname, float fees){
        this.cid = cid;
        this.cname = cname;
        this.fees = fees;
    }

    public String toString(){
        return "Course Id : "+cid+" Course Name : "+cname+" Fees : "+fees;
    }
}