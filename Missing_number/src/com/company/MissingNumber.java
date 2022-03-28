package com.company;

import java.util.Arrays;
// Q. To find missing number in a given Array consisting of numbers from 0 to N

class MissingNumber {

    public static void main(String[] args) {
	// write your code here
        int [] arr={5,2,3,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int missing=missing(arr);
        System.out.println(missing);

    }
    static void sort(int[] arr){

        int i = 0;
        while ( i < arr.length) {
            if (arr[i] >= arr.length) {
                i++;
            } else {
                int correct = arr[i];
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
        }

    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    static int missing(int[] arr){
        int i =0;
        while(i<arr.length){

            if (arr[i]==i){
                i++;
            }
            else{
                return i;
            }

        }
        return i;
    }
}

