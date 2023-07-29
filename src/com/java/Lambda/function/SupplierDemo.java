//package com.java.function;
//
//import java.time.LocalDateTime;
//import java.util.function.Supplier;
//
//class suplier implements Supplier<LocalDateTime>{
//
//    @Override
//    public LocalDateTime get() {
//        return LocalDateTime.now();
//    }
//}
//
//public class SupplierDemo {
//    public static void main(String[] args) {
//        Supplier<LocalDateTime> now = new suplier();
//        System.out.println( now.get());
//    }
//}
package com.java.Lambda.function;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<LocalDateTime> now1 = () -> LocalDateTime.now();
        System.out.println( now1.get());
    }
}
