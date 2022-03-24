package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of series: ");
        int n = in.nextInt();
        if (n>2) {
            int a = 0;
            int b = 1;
            System.out.print(a + " ");
            for (int i = 2; i <= n; i++) {
                int x = a + b;
                a = b;
                b = x;
                System.out.print(a + " ");


            }
        }else{
            System.out.println("Minimum size required is 3");
        }
    }
}