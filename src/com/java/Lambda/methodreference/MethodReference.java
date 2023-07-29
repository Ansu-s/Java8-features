package com.java.Lambda.methodreference;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

interface  Show{
    public void show(String message);
}
public class MethodReference {

    public static int mul(int a, int b) {
        return a * b;
    }


    public void display(String message) {
        message = message.toUpperCase();
        System.out.println(message);
    }


    public static void main(String[] args) {

        // Lambda expression to show method reference to a static method
        Function<Integer, Double> root = (givenNum) -> Math.sqrt(givenNum);
        System.out.println(root.apply(487));

        // Method reference

        Function<Integer, Double> root1 = Math::sqrt;
        System.out.println(root1.apply(557));

        Function<String, Integer> check = String::length;
        System.out.println(check.apply("caliente"));

        //Method reference to mul method
        BiFunction<Integer, Integer, Integer> bifun = (Integer a, Integer b) -> MethodReference.mul(a, b);
        System.out.println(bifun.apply(44, 55));

        // Converting the above lambda expression to a method reference

        BiFunction<Integer, Integer, Integer> bifun1 = MethodReference::mul;
        System.out.println(bifun1.apply(85, 48));

        // method reference to an instance of an object

        MethodReference obj1 = new MethodReference();

        Show lam = (message) -> obj1.display(message);
        lam.show("Hello java World");

        // converting to method reference

        Show lam1 = obj1::display;
        lam1.show("Hellow java WOrld");

        //Reference to the instance method of an arbitrary object
        Function<String, String> funs = (String str) -> str.toLowerCase();
        funs.apply("Hello WORLD");

        // converting method reference
        Function<String, String> funs1 = String::toLowerCase;
        funs1.apply("HeLLOW The World");


        String[] arry = {"w", "a", "A", "d", "c", "B"};
        Arrays.sort(arry, (o1, o2) -> o1.compareToIgnoreCase(o2));
        // MethodReference s1 = new MethodReference();
        System.out.println(Arrays.toString(arry));

        //converting to method reference

        Arrays.sort(arry, String::compareToIgnoreCase);

        //Constructor reference
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);

        Function<List<String>, HashSet<String>> l1 = (inputList) -> new HashSet<>(inputList);
        System.out.println(l1.apply(fruits));

        // converting to method reference

        Function<List<String>, HashSet<String>> l2=HashSet::new;
        System.out.println(l2.apply(fruits));

    }
}