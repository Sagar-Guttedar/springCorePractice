package com.joc;

public class Employee {
    int empid;
    String ename;
    float esalary;

    public void setEmpid(int empid){
        this.empid=empid;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setEsalary(float esalary){
        this.esalary=esalary;
    }

    public String toString(){
        return "Employee Id : "+empid+" Employee Name : "+ename+" Employee Salary : "+esalary;
    }
}
