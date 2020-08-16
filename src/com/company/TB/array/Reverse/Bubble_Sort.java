package com.company.TB.array.Reverse;

public class Bubble_Sort {

    public static void main(String[] args) {

        // reverse array
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndx = intArray.length - 1; lastUnsortedIndx > 0; lastUnsortedIndx--) {
            for (int i = 0; i < lastUnsortedIndx; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int value : intArray) {
            System.out.println(value);
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
