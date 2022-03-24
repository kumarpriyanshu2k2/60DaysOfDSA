package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        if(isPalindrome(word)){
            System.out.println(word+ " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }

    }

    static boolean isPalindrome(String word){
        word=word.toUpperCase(Locale.ROOT);
        boolean b = false;
        for (int i=0; i<word.length()/2;i++){
            if (word.charAt(i)==word.charAt(word.length()-1-i)){
                b = true;
            }else{break;}


        }
        return b;
    }
}
