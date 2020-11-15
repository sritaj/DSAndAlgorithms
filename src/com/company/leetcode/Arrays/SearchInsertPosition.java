/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 */
package com.company.leetcode.Arrays;

import java.util.Scanner;

public class SearchInsertPosition {

    public static int searchInsert(int[]arr, int target){

        if(arr.length == 0){
            return 0;
        }

        int searchPosition = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                searchPosition = i;
                return searchPosition;
            }else if(arr[i]>target){
                searchPosition = i;
                return searchPosition;
            }
        }


        return searchPosition + arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[]arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int val = searchInsert(arr, target);
        System.out.println(val);
    }
}
