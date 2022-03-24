package com.company;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter Principal amount");
        int P = in.nextInt();
        System.out.println("Please enter Rate of interest");
        int R = in.nextInt();
        System.out.println("Please enter Time period");
        int T = in.nextInt();
        double si=simple_interest(P,R,T);
        System.out.println("Simple interest is \n"+si);
    }
    static double simple_interest(int P,int R, int T){
        double si = P*R*T/100;
        return si;
    }
}
