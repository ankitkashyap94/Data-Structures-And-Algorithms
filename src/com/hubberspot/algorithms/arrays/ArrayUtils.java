package com.hubberspot.algorithms.arrays;

import java.util.Arrays;

public class ArrayUtils {


    public void printArray(int[] arr) {
        int arrNos = arr.length;
        for (int i = 0; i < arrNos; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public void arrayDemo() {

        int[] myArray = new int[5];
        myArray[0] = 2;
        myArray[1] = 1;
        myArray[2] = 5;
        myArray[3] = 8;
        myArray[4] = 2;
        myArray[2] = 55;
//        myArray[5] = 10;
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 3]);

        printArray(myArray);
    }

    public static void main(String[] args) {

        ArrayUtils arrUtil = new ArrayUtils();
        arrUtil.arrayDemo();

        int[] arr = {1, 55, 48, 63};
        System.out.println(Arrays.stream(arr).max());

    }
}
