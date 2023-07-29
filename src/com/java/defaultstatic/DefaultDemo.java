package com.java.defaultstatic;

interface bike{
    String bikeName ();
    String  speedup();
    String  speeddown();

    default String bikeAlarm(){
        return "the alarm is on";
    }
    default String bikeAlarmOff(){
        return "The alarm is off";
    }
       static String getBrand(){
        return "Yamaha";
       }

}

class mybike implements bike{

    @Override
    public String bikeName() {
        return "Yamaha";
    }

    @Override
    public String speedup() {
        return "The bike is accelerating";
    }

    @Override
    public String speeddown() {
        return "The bike is breaking";
    }
}
public class DefaultDemo {
    public static void main(String[] args) {

        bike b1 = new mybike();
        System.out.println( b1.bikeName());
        System.out.println( b1.speedup());
        System.out.println(b1.speeddown());

        System.out.println( b1.bikeAlarm());
        System.out.println(b1.bikeAlarmOff());
        // calling static method from the interface
        System.out.println(bike.getBrand());
    }
}
