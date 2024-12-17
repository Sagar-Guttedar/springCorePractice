package com.joct;

import java.util.List;

public class Question {
    int qid;
    String qname;
    List<String> answer;

    public Question(int qid, String qname, List<String> answer){
        this.qid = qid;
        this.qname = qname;
        this.answer = answer;
    }
    public void display(){
        System.out.println("Question Id is : "+qid+" Question Name : "+qname);
        for(String s:answer){
            System.out.println(s);
        }
    }
}