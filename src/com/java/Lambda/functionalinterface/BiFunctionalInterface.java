package com.java.Lambda.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionalInterface implements BiFunction<Integer,Integer,Integer> {

    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer + integer2;
    }


    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunctionalInterface();
        System.out.println( biFunction.apply(55,4));
        System.out.println( biFunction.apply(41,4));

        // lambda expn
        BiFunction<Integer,Integer,Integer> bifun = (t,u)-> t+u;
        System.out.println( bifun.apply(4,5));


        Function<Integer,Integer> funw = (a)-> a*a;
        System.out.println( bifun.andThen(funw).apply(4,54));
    }
}
