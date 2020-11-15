/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
package com.company.leetcode.Arrays;

import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums){
        int majorityElement = nums.length/2;

        for(Integer n : nums){
            int count = 0;
            for (Integer m : nums){
                if(n==m){
                    count++;
                }
            }

            if (count>majorityElement){
                return n;
            }
        }

        /*
        for (int i = 0; i<nums.length; i++){
            int count = 1;
            for (int j = 1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count>majorityElement){
                return nums[i];
            }
        }
         */

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
    }
}
