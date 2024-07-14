package com.hubberspot.algorithms.arrays;

public class MoveZerosToEndOFArray {
    public static void main(String[] args) {

        int[] arr = {22, 45, 85, 0, 0, 14, 0, 23, 77};
        int[] zeros = moveZeros(arr);
        for(int zero : zeros){

            System.out.print(zero+" ");

        }


    }

    public static int[] moveZeros(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] !=0){
                j++;
            }


        }
        return arr;

    }


}
