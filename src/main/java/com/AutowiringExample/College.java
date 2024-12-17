package com.AutowiringExample;

public class College {
    String colName;
    String city;
    Course course;

    public void setColName(String colName){
        this.colName = colName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCourse(Course course){
        this.course = course;
    }

    public String toString(){
        return "College Name : "+colName+" City : "+city+" Course : "+course.toString();    }
}