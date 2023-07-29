package com.java.Lambda.lambdaexpression;

interface addtion{
    public int add ( int a , int b);
}
class a implements addtion{

    @Override
    public int add(int a, int b) {
        return (a+b);
    }
}
public class LambdaParams {
    public static void main(String[] args) {


        addtion addTwo = (int a , int b) ->(a+b);
        int c =addTwo.add(5,7);
        System.out.println(c);

        addtion abtc = (int a , int b) -> {
          int d = a+b;
            return d;

        };
         int e = abtc.add(8,9);
        System.out.println(e);
    }
}
