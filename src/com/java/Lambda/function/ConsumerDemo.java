//package com.java.function;
//
//
//import java.util.function.Consumer;
//
//class demo implements Consumer<String>{
//
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}
//public class ConsumerDemo {
//    public static void main(String[] args) {
//
//        Consumer<String> fun = new demo() ;
//        fun.accept("Java world");
//    }
//}

package com.java.Lambda.function;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> fun = (String s) -> System.out.println(s);
        fun.accept("java world");

    }
}