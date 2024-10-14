package com.in60minutes.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        //HashSet -> HashMap -> Array of nodes(key,value);
        //new Object();
        Set<String> s1 = new HashSet<>();
        s1.add("13");
        s1.add("53");
        s1.add("92");
        s1.add("92");
        System.out.println(s1.remove("92"));
        System.out.println(s1);
    }
}
