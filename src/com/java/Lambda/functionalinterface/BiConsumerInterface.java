package com.java.Lambda.functionalinterface;

import java.util.function.BiConsumer;

class BiConsumerInterface implements BiConsumer<Integer,Integer> {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = new BiConsumerInterface();
        biConsumer.accept(55,4);
        biConsumer.accept(41,4);
    }

    @Override
    public void accept(Integer integer, Integer integer2) {
        System.out.println( integer+integer2);

    // lambda
        BiConsumer<Integer, Integer> biConsumer1 = (a,b)-> System.out.println(a+b);

        biConsumer1.accept(74,55);
    }
}



