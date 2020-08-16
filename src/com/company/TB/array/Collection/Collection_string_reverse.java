package com.company.TB.array.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_string_reverse {

    public static void main(String[] args) {

        // reverse array

        ArrayList<String> list = new ArrayList<>();
        list.add("JavaFX");
        list.add("Java");
        list.add("WebGL");
        list.add("OpenCV");
        list.add("AAA");

        System.out.println(list);

        System.out.println("*************************** Sorted list by name;");
        Collections.sort(list);
        System.out.println(list);
    }
}
