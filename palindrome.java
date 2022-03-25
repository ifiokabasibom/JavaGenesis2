package com.systemspecs.palindrome;

import java.util.LinkedList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        This is a better implementation of the palindrome test but only limitation here is that this
        implementation can not work integer testing
        
         */
        
        //True
        System.out.println(checkForPalindrome("abccba"));
        //True
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        //True
        System.out.println(checkForPalindrome("I did, did I?"));
        //False
        System.out.println(checkForPalindrome("hello"));
        //True
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i<lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());

    }
}
