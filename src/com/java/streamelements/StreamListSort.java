package com.java.streamelements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSort {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

       List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
       // sortedList.forEach(System.out::println);

        List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1 = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList1);
    // for descending order sorting
        List<String> sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList4);



        List<String> sortedList5 = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList5);


    }
}
