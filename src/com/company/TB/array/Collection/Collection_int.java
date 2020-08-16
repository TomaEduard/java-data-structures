package com.company.TB.array.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_int {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(6);
        list.add(55);
        list.add(-22);
        list.add(-7);

        System.out.println(list);

        System.out.println("*************************** reverse the list -> Collections.reverse(list);");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("*************************** swap index[2] with index[5] -> Collections.swap(list, i, j);");
        Collections.swap(list, 2, 4);
        System.out.println(list);

        System.out.println("*************************** descendent sort -> Collections.sort(list);;");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        System.out.println("*************************** shuffle the list -> Collections.shuffle(list);");
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("*************************** ascendent sort -> Collections.sort(list);;");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("*************************** reverseOrder sort -> Collections.sort(list);;");
        Collections.reverse(list);
        System.out.println(list);

    }
}
