package com.hubberspot.algorithms.arrays;

public class RemoveEvenIntegersFromArray {

    public static int[] removeEvenNumbers(int[] arr) {

        int oddCount = 0;
        int idx = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];


        for (int j = 0; j < arr.length; j++) {


            if (arr[j] % 2 != 0) {

                result[idx] = arr[j];
                idx++;

            }

        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {22, 45, 85, 53, 66, 14, 96, 23, 77};

        RemoveEvenIntegersFromArray remEven = new RemoveEvenIntegersFromArray();

        int[] results = remEven.removeEvenNumbers(arr);
        System.out.println(results.length);

        for(int result : results){

            System.out.print(result + " ");
        }
    }
}
