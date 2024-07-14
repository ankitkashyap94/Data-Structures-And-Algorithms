package com.hubberspot.algorithms.arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {22, 45, 85, 53, 66, 14, 96, 23, 77};
        printArray(arr);
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }


    //Printing Array Values
    public static void printArray(int[] newArr) {

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }


    //Reverse Array Values
    public static void reverseArray(int[] newArr, int start, int end) {

        int n = newArr.length;

        while (start < end) {

            //Swap Values
            int temp = newArr[start];
            newArr[start] = newArr[end];
            newArr[end] = temp;
            start++;
            end--;


        }


    }
}