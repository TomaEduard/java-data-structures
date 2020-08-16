package com.company.TB.array;

public class Selection_sort_asc {

    public static void main(String[] args) {

        // Ascendant sorting

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // right to left
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
//            System.out.println("#1: "+lastUnsortedIndex);
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                // if 35 is bigger than 20, largest will be updated to 1
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // swap
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
