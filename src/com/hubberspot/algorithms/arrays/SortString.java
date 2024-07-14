package com.hubberspot.algorithms.arrays;

public class SortString {
    public static void main(String[] args) {
        String name = "Monika";
        char[] chs = name.toLowerCase().toCharArray();


        for(int i=0; i<(chs.length-1); i++){
            for(int j = i+1; j>0; j--){
                if(chs[j]<chs[j-1]){

                    char temp = chs[j-1];
                    chs[j-1] = chs[j];
                    chs[j] = temp;

                }
            }
        }

        name = String.valueOf(chs);
        System.out.println(name);



    }
}
