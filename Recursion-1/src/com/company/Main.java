package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        funrev(5);
        System.out.println(factorial(5));
        System.out.println(sumofdigits(12394));
        System.out.println(rev(1234));
    }

    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if (n==0) {
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        if (n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumofdigits(int n){
        if (n==0){
            return 0;
        }
        return n%10+sumofdigits(n/10);
    }
    static int rev(int n){
        if(n%10==n){
            return n;
        }
        int base = (int) Math.pow(10,(int)Math.log10(n));
        return (n%10)*base+rev(n/10);
    }

}
