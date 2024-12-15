package com.joct;

public class Address {
    int hno;
    String city, state;

    public Address(int hno,String city, String state){
        this.hno = hno;
        this.city = city;
        this.state = state;
    }

    public int getHno(){
        return hno;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
     }
}