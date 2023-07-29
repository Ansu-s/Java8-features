package com.java.streamelements;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SteamFindElements {

    public static void main(String[] args) {


        List<Integer> l1 = Arrays.asList(4,7,1,7,5,2);

        //        findFirst()
        Optional<Integer> empy = l1.stream().findFirst();
        if(empy.isPresent()){
            System.out.println("The element is present "+empy.get());
        }else
        {
            System.out.println("The elemetn is not present");
        }

//              findAny()
        Optional<Integer> empy1 = l1.stream().findAny();
        if(empy1.isPresent()){
            System.out.println("The element is present "+empy1.get());
        }else
        {
            System.out.println("The elemetn is not present ");
        }


    }
}
