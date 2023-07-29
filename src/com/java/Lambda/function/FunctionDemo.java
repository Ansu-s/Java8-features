package com.java.Lambda.function;

import java.util.function.Function;

class myclass implements Function<String , Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String , Integer> fun = new myclass();
        System.out.println(  fun.apply("Hello Java"));

        // Insted of writitng all the above code for functio implementation we can just write the below lamda expresseion
        Function< String, Integer> fun1= (String se) -> se.length();
        System.out.println(fun1.apply("Happy"));
    }
}
