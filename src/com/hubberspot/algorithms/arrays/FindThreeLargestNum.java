package com.hubberspot.algorithms.arrays;

import java.util.Arrays;

public class FindThreeLargestNum {

    public static void main(String[] args) {


        int[] nums = {45, 25, 66, 48, 95, 32, 11};

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int sn : nums){
            System.out.println(sn);
        }


    }

}
