package com.systemspecs.intpalindrome;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        Test if an integer or a string is a palindrome.
        This implementation has the following limitations;
        1. It doesn't convert to all lower case before checking for Palindrome condition.
        2. Doesn't trim out special characters and spaces    
        
        */
        String original, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string or integer to test for Palindrome");
        original = input.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Your input is a Palindrome");
        } else {
            System.out.println("Your input is NOT a Palindrome");
        }

    }

}

