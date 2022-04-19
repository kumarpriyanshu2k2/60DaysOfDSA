package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(bs(arr,0,arr.length-1,9));


    }
    static int bs(int[]arr,int start, int end,int target){
        int mid = (start+end)/2;
        if(target>arr[end]){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid]<target){
            return bs(arr,mid+1,end,target);
        }
        else {
            return bs(arr,start,mid-1,target);
        }

    }
}
