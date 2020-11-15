/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */
package com.company.leetcode.Arrays;

import java.util.Scanner;

public class ThirdMaximum {

    public static int thirdMax(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;

        for(Integer n : nums){

            if(n.equals(max) || n.equals(second_max) || n.equals(third_max)){
                continue;
            }

            if(max == null || n > max){
                third_max = second_max;
                second_max = max;
                max = n;
            }else if(second_max == null || n > second_max){
                third_max = second_max;
                second_max = n;
            }else if (third_max == null || n > third_max){
                third_max = n;
            }
        }

        if(third_max == null){
            return max;
        }

        return third_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int val = thirdMax(nums);
        System.out.println(val);
    }
}
