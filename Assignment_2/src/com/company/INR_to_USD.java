package com.company;

import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in rupees:");
        int rs = in.nextInt();
        System.out.println("amount in US dollar is: "+usd(rs));

    }
    static double usd(int rs){
        double usd =  rs/76.29;
        return usd;
    }
}
