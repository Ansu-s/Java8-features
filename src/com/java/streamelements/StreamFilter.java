package com.java.streamelements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {


       List<bike> list2 = getbike()
               .stream()
               .filter((ids)->ids.getId()>1)
               .collect(Collectors.toList());

        list2.forEach (System.out::println);
             {
            
        }
    }
    private static List<bike>  getbike(){
        List<bike> bikeList = new ArrayList<bike>();
        bikeList.add( new bike(1,"Yamaha","high 200hp"));
        bikeList.add( new bike(2,"Ducati","high 210hp"));
        bikeList.add( new bike(3,"Kawasaki","high 212hp"));
        return bikeList;
    }
}

class bike{
    private int id;
    private String name;

    private String power;

    bike(int id,String name,String power){
        super();
        this.id = id;
        this.name = name;
        this.power = power;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "bike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}