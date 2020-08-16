package com.company.TB.array;

public class Insertion_sort_asc {

    public static void main(String[] args) {

        // Ascendant sorting

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            // we are on -15
            // firstUnsortedIndex = 2 > 0(yes) && intArray[2]35 > intArray[i]-15   { intArray[2]-15 = intArray[2-1]30}
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        // left to right
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }


}
