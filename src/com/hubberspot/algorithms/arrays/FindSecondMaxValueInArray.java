package com.hubberspot.algorithms.arrays;

public class FindSecondMaxValueInArray {
    public static void main(String[] args) {

        int[] arr = {22, 45, 85, 53, 66, 14, 96, 23, 77};
        System.out.println(fineSecondMax(arr));;

    }

    public static int fineSecondMax(int[] arr){

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){

                secMax = max;
                max = arr[i];

            }else if(arr[i] > secMax && arr[i] != max){

                secMax = arr[i];

            }


        }

        return secMax;
    }


}

