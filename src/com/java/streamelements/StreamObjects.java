package com.java.streamelements;

import java.util.*;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {

        // creating a stream
        Stream<String> s1 = Stream.of("a", "b","g","slf") ;
        s1.forEach(System.out::println);

//       Creating a stream from a source
        Collection<String> col = Arrays.asList("Hello", "java","world");
        Stream <String> s2 = col.stream();
        s2.forEach(System.out::println);

        List<String> list = Arrays.asList("Hello", "java","world");
        Stream <String> s3= list.stream();
        s3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream <String> s4 = col.stream();
        s4.forEach(System.out::println);

        String[] strarray = {"sf","fsfd","fjfd","a"};
        Stream<String> s5 = Arrays.stream(strarray);
        s5.forEach(System.out::println );

   }
}
