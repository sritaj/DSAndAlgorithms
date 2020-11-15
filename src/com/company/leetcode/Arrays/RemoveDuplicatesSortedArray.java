/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
 */
package com.company.leetcode.Arrays;

import java.util.Scanner;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
               i++;
               arr[i] = arr[j];
            }
        }

        return i+1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int val = removeDuplicates(arr);
        System.out.println(val);

    }
}
