package com.company;

import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int n1= in.nextInt();
        System.out.println("Enter the 2nd number:");
        int n2= in.nextInt();
        int m = max(n1,n2);
        System.out.println("Maximum number is: \n"+m);
    }
    static int max(int n1, int n2){
        if (n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}
