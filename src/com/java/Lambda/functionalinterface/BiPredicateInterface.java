package com.java.Lambda.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {

        BiPredicate<String,String> biPredicate=(s1,s2) -> s1.equals(s2);
        System.out.println( biPredicate.test("hello", "Hello"));
        System.out.println( biPredicate.test("Hello", "Hello"));

        BiPredicate<Integer,Integer> biPredicate1 = (x,y)-> x>y;
        BiPredicate<Integer,Integer> biPredicate2 = (x,y)-> x==y;

        boolean result = biPredicate1.and(biPredicate2).test(45,43);
        System.out.println(result);

        boolean result1 = biPredicate1.or(biPredicate2).test(45,43);
        System.out.println(result1 );

    }
}
