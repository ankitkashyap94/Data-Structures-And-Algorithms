package com.hubberspot.algorithms.arrays;

public class FindMissingNumbersInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6};
        findMissingNumbers(arr);

    }

    //logic
    public static void findMissingNumbers(int[] arr){

        int size = arr.length+1;
        int total = (size * (size +1)) / 2;
        System.out.println(total);
        int rem = 0;

        for(int newArr : arr){

            total = total - newArr;


        }


        System.out.println(total);



    }

}
