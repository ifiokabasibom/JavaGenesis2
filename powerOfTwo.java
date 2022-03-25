package com.systemspecs.powerof2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Code to check if a number is a power of two
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to test: ");
        int number = Integer.parseInt(input.nextLine());
        if ((Math.log(number) / Math.log(2)) % 1 == 0){
            System.out.println(number + " is a Power of 2 ");
        }else
            System.out.println(number + " is NOT a power of 2 ");
    }
}
