package com.hubberspot.algorithms.arrays;

import java.util.Locale;

public class CheckPalindrome {

    public static void main(String[] args) {

        String name = "Madam";

        CheckPalindrome chkPalin = new CheckPalindrome();

        chkPalin.checkpalindrome(name.toLowerCase());

    }

    public void checkpalindrome(String name) {

        String rev = "";
        System.out.println(name);

        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);


        }

        System.out.println(rev);

        if (name.equals(rev)) {
            System.out.println("This String is Palindrome");
        }else{
            System.out.println("This is not a palindrome string");
        }

    }
}
