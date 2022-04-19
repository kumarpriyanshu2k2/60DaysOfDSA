package com.company;

import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        int[] nums ={1,2,4,6,7,4,32,2,1};
        findallindex(nums,2,0,list);
        System.out.println(findall(nums,4,0));


    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr,int target,int index, ArrayList<Integer> list){
        if (index==arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
       findallindex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findall(int[] arr,int target, int index){
        ArrayList<Integer> list= new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        list.addAll(findall(arr,target,index+1));
        return list;
    }

}
