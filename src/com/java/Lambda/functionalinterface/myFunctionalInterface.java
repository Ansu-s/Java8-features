package com.java.Lambda.functionalinterface;

@FunctionalInterface
interface  f1{
    public void draw();
    public default void add() {
        System.out.println("hello");
    }
        static void sum(){
            System.out.println("java");
        }
//        public void mul();  error compiletime
    }
class myclass implements f1{


    @Override
    public void draw() {
        System.out.println("Adding two numbers");
    }
}
public class myFunctionalInterface extends myclass{
    public static void main(String[] args) {

     f1 ex = ()  -> System.out.println("Hellow world");
     ex.draw();
    }
}
