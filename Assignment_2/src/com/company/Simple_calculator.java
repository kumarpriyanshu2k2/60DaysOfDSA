package com.company;


import java.util.Scanner;

public class Simple_calculator {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Enter X to exit");
            System.out.println("Enter operator: ");

            char operator = in.next().trim().charAt(0);


            if(operator== '*'|| operator== '+'|| operator== '-'|| operator== '/'){
                System.out.println("Enter two numbers: ");
                double n1 = in.nextDouble();
                double n2 = in.nextDouble();
                double r=0;
                if( operator=='*'){
                    r= n1*n2;

                }
                if( operator=='+'){
                    r= n1+n2;

                }
                if( operator=='-'){
                    r= n1-n2;

                }
                if( operator=='/'){
                    r= n1/n2;

                }
                System.out.println(r+"");
            }
            else if(operator=='x'||operator=='X'){
                break;
            }
            else {
                System.out.println("Enter a valid operator");
            }
        }



    }
}
