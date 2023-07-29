package com.java.streamelements;
import java.util.Arrays;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
public class ForEachMethodExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(number -> System.out.println(number));

        }

}



