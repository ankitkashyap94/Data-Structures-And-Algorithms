package com.hubberspot.algorithms.arrays;

public class ResizeArray {

    public static void main(String[] args) {

        int[] arr = {22, 45, 85, 14, 23, 77};

        int capacity = 12;
        printArray(arr);
        int[] newArr = resizeArray(arr, capacity);
        printArray(newArr);

    }

    public static int[] resizeArray(int[] arr, int capacity) {

        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;

    }

    public static void printArray(int[] arr) {
        int arrNos = arr.length;

        for (int i = 0; i < arrNos; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}