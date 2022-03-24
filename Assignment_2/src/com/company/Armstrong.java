package com.company;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 2 numbers between which you want to find the Armstrong numbers");
        System.out.println("Please enter the smaller number of the range:");
        int lower = in.nextInt();
        System.out.println("Please enter the larger number of the range:");
        int upper = in.nextInt();
        for(int x=lower; x<=upper ;x++){
            if (isArmstrong(x)){
                System.out.println(x);
            }

        }

    }
    static boolean isArmstrong(int n){

        int original = n;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum += r*r*r;
            n= n/10;
        }
        return sum == original;


    }

}

