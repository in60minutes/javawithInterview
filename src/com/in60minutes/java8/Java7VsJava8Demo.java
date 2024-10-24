package com.in60minutes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java7VsJava8Demo {
    public static void main(String[] args) {
        int total = 0;
        for (int i=0;i<=50;i++){
            total +=i;
        }
        System.out.println("Java 7 "+total);

        //java8
        int total1 = IntStream.rangeClosed(0,50)
                .map(Integer :: new)
                .sum();
        System.out.println("Java 8 "+total1);

        List<String> names = Arrays.asList("Raju","Sekhar","Raju","Harsha","Kiran");
        List<String> uniqueList = new ArrayList<>();

        for (String name : names){
            if (!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("unique "+ uniqueList);
        //
        List<String> uniqueList1 = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("unique "+ uniqueList1);
    }
}
