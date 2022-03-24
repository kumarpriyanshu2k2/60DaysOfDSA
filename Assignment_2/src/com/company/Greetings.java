package com.company;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        greetings(name);
    }
    static void greetings(String name){
        System.out.println("hello "+name +" !");
    }
}