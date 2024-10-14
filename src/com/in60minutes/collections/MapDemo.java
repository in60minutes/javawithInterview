package com.in60minutes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> m1 = new HashMap<>();
        m1.put(101,"Telugu");

        System.out.println(m1.values());
    }
}
