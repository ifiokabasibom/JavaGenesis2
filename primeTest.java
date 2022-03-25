package com.systemspecs.primetest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Accepts user input and test if it is a prime number or not
        int number = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to test: ");
        number = Integer.parseInt(input.nextLine());
        int mid = number/2;
        if (number == 0 || number == 1){
            System.out.println(number + " is NOT a Prime Number");
        }else{
            for (i = 2; i <= mid; i++){
                if (number % i ==0){
                    System.out.println(number + " is NOT a Prime Number");
                    break;
                }else{
                    System.out.println(number + " is a Prime Number or any of zero or one");
                    break;
                }
            }

        }
        
    }
}
