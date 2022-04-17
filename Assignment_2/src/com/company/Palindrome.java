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
        int x = 121;
        String w = Integer.toString(x);
        word=word.toUpperCase(Locale.ROOT);
        boolean b = false;
        if (word.length()==1){
            b=true;
            return b;
        }
        for (int i=0; i<word.length()/2;i++){
            if (word.charAt(i)==word.charAt(word.length()-1-i)){
                b = true;
            }else{
                b= false;
                break;
            }


        }
        return b;
    }
}
