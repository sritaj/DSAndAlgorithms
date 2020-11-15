/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

 */
package com.company.leetcode.Arrays;

import java.util.Scanner;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums){

        if(nums.length == 0 || nums.length == 1){
            return nums;
        }

        int left = 0;
        int right = 0;
        int temp;

        while(right<nums.length){

            if(nums[right]==0){
                right++;
            }else{
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                left++;
            }
        }

        return nums;
    }

    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print("[ " + arr[i] + " ]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        display(nums);

        int[] val = moveZeroes(nums);

        display(val);
    }
}
