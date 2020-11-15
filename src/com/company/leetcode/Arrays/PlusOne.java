/*
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]
 */
package com.company.leetcode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        for(int i = arr.length-1; i>=0; i--){

            if(arr[i]<9){
                arr[i]++;
                return arr;
            }else{
                arr[i] = 0;
            }
        }

        if(arr[0]==0){
            int temp[] = new int[arr.length+1];
            temp[0] = 1;
            return temp;

        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] val = plusOne(arr);
        System.out.println(Arrays.toString(val));

    }
}
