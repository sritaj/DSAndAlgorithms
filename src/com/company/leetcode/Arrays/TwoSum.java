package com.company.leetcode.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i<nums.length; i++){

            for(int j = i+1; j<nums.length; j++){

                if(nums[i]+nums[j] == target){

                    return new int[] {i, j};
                }
            }
        }

        return new int[]{};

    }

    public static void main(String[] args) {

        int arr[] = {2,7,11,15};
        int target = 44;
        int arr1[] = twoSum(arr,target);

        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr[i]);
        }
    }
}
