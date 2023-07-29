package com.java.Lambda.lambdaexpression;

interface Sayhello{
    void say();
}
class person implements Sayhello
{

    @Override
    public void say() {
        System.out.println("hello person");
    }
}
class object implements Sayhello
{
    @Override
    public void say()
    {
        System.out.println("Hello object");
    }
}
public class LambdaExpExample {
    public static void main(String[] args) {
//        LambdaExpExample o1 = new LambdaExpExample();
//        person o2 = new person();
//
//        o2.say();
//
//        Sayhello o4 = new person();
//        o4.say();
//        object o3 = new object();
//        o3.say();
//        //o1.say();
//        // printing the same using LambdaExpressions
//

        Sayhello ex  = () -> {
            System.out.println("hellow java");
        };
       ex.say();
        Sayhello hi =() -> {
            System.out.println("hello object");
        };
        print(hi);

        
        //passing LambdaExpression as method paremeter
        print(() -> {System.out.println("hello object");});


    }
    public static void print(Sayhello sayy)
    {
        sayy.say();
    }

}
