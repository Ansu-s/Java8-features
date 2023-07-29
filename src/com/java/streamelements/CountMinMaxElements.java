package com.java.streamelements;

import java.util.Comparator;
import java.util.stream.Stream;

public class CountMinMaxElements {
    public static void main(String[] args) {



    Stream <Integer> stream =Stream.of(4,4,457,1,4,4);
       System.out.println( stream.count());

        Integer intr = Stream.of(4,4,457,1,4,4).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(intr);

        Integer intr1 = Stream.of(4,4,457,1,4,4).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(intr1);
}
}
