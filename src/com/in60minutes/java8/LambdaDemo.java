package com.in60minutes.java8;

interface A1{
    void m1();
    public default void m2(){
        System.out.println("Default method ...");
    }
}
public class LambdaDemo{
    public static void main(String[] args) {

        A1 a1 = ()-> System.out.println("Hello world...");
                a1.m1();

    }
}
