package com.java.streamelements;

import java.util.HashMap;
import java.util.Map;
class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ForEachMap {

    public static  void main(String[] args) {

        Map<Integer,Person> map = new HashMap<Integer,Person>();
        map.put(1,new Person(1,"Ram"));
        map.put(2,new Person(2,"Sita"));
        map.put(3,new Person(3,"Gopal"));

        for (Map.Entry<Integer,Person> per: map.entrySet()
             ) {
            System.out.println(per.getKey());
            System.out.println(per.getValue().getName());

            //lambda

            map.forEach((k,v)->{
                System.out.println(k);
                System.out.println(v.getName());
                System.out.println(v.getId());
            } );
        }
    }
}
