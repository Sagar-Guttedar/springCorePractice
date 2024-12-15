package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        MapEx me =(MapEx) ctx.getBean("map");

        System.out.println("Id : "+me.getId());

        Map<String,String>m=me.getMp();

        //KeySet
        Set<String> s=m.keySet();
        s.forEach(
                (x)->{
                    String key=x;
                    String val=m.get(key);
                    System.out.println("Key :"+key+" Value : "+val);
                }
        );

        System.out.println("-----------------------------------------------------");

        //entr set

        for (Map.Entry<String,String>e:m.entrySet()){
            System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
        }

        //Lambda Expression
        m.forEach(
                (x,y)->
                        System.out.println("Key ***** : "+x+" Value ***** : "+y)
        );
    }
}
