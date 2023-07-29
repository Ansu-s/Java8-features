package com.java.optionalclass;

import java.util.Map;
import java.util.Optional;
import java.util.logging.Filter;

public class OptionalClass {
    public static void main(String[] args) {

        String name = "hello";
        String name1 = null;

        // of() method
        Optional<Object> optnemty = Optional.empty();
        System.out.println(optnemty);

        Optional<String> ofcheck = Optional.of(name);
        System.out.println(ofcheck);

//     //   System.out.println(name1);
//          Optional<String> ofcheck1 = Optional.of(name1);
//          System.out.println(ofcheck1);


        // ofNullable method

        Optional<String> optnl = Optional.ofNullable(name);
        System.out.println(optnl);

        Optional<String> optnl1 = Optional.ofNullable(name1);
        System.out.println(optnl1);

        //get () to retrive the value of the container
        Optional<String> optn3 = Optional.ofNullable(name);
        System.out.println(optn3.get());

//        Optional<String> optn4 = Optional.ofNullable(name1);
//        System.out.println(optn4.get());

        //isPresent(), isEmpty() usage
//        if (optn3.isPresent()) {
//            System.out.println("The value is present");
//        } else {
//            System.out.println("It is empty");

            // orElse () provides a default value if null

            Optional<String> optn5 = Optional.ofNullable(name1);
            String defaultValue = optn5.orElse("This is shown if null is present");
            System.out.println(defaultValue);

            Optional<String> optn6 = Optional.ofNullable(name1);
          String string = optn6.orElseGet(()->"Using the orElseGet");
        System.out.println(string);

//        //orElseThrow
//        String the_defined_exception_occurred = optn6.orElseThrow(() -> new RuntimeException("The defined exception occurred"));
//        System.out.println(the_defined_exception_occurred);

          String cheak = "Rama";
//        if(cheak != null && cheak.contains("am"))
//        {
//            System.out.println("The name is correct");
//        }

        Optional<String> otn = Optional.of(cheak);
        otn.filter((chk)-> chk.contains("s"));
        otn.ifPresent((chk)->System.out.println(chk));

        //Map method helps to convert the value optional form in one type to another

        Optional<String> otn1 = Optional.of(cheak);
        otn1.filter((chk)-> chk.contains("Rama"))
                .map(String::toUpperCase)
                .ifPresent((chk)-> System.out.println(chk));



    }
    }
