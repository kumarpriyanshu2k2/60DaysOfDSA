package com.company;

public class Find {
    public static void main(String[] args) {
        int[] nums={1,2,4,5,6,4,6,8};
        System.out.println(Findindex(nums,0,5));


    }
    static int Findindex(int[] nums,int index, int target){
        if (index==nums.length){
            return -1;
        }
        if (nums[index]==target){
            return index;
        }
        return Findindex(nums,index +1,target);
    }
}
