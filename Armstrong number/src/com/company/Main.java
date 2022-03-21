package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        for(int x=0; x<=i ;x++){
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
