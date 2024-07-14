package com.hubberspot.algorithms.arrays;

public class FindMinValueInArray {

    public static void main(String[] args) {

        int[] arr = {22, 45, 85, 53, 66, 14, 96, 23, 77};
        printArray(arr);
       int minvalue = findMinValue(arr);
        System.out.println(minvalue);


    }

    //logic
    private static int findMinValue(int[] arr) {

        int min = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i] < min)
                min = arr[i];
        }

       return min;

    }

    public static void printArray(int[] newArr) {

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

}
