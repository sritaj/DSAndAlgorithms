/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
package com.company.leetcode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {

    public static boolean containsDuplicateElements(int[] arr){
        if(arr.length == 0){
                return false;
        }

        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = containsDuplicateElements(arr);

        System.out.println(flag);

    }
}
