package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1,2,3,4,5};
        System.out.println(sorted(nums,0));
    }
    static boolean sorted(int[] nums,int index){
        if(index==nums.length - 1){
            return true;
        }
        return sorted(nums,index+1) && nums[index]<nums[index+1];
    }
}
