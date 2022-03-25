package com.systemspecs.eveninttest;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test if a number is Even or Not
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter INTEGER number to be tested");
        number = Integer.parseInt(input.nextLine());
        if (number % 2 == 0){
            System.out.println("The integer number is Even");
        }else{
            System.out.println("The number is NOT Even");
        }


    }

}

