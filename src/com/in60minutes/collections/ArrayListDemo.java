package com.in60minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Raju");
        l1.add("Siva");
        l1.add("Kiran");
        l1.add("Sekhar");
        l1.add("Madhu");
        l1.add("Gopi");
        l1.add("chendhu");
        l1.add("sai");
        l1.add("Balu");
        l1.add("Balu");
        l1.add("Balu");


        System.out.println(l1.size());
        System.out.println(l1.capacity());

    }
}
