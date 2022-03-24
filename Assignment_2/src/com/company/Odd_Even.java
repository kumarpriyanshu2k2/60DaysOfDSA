package com.company;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (isEven(n)){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }


    }
    static boolean isEven(int n){
        boolean E = n%2==0;
        return E;
    }
}

