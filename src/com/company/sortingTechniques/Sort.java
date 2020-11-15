/*
Binary Search Algorithm
 */
package com.company.sortingTechniques;

public class Sort {

    public static void sort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for (int j= i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void printArray(int[]arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,14,2,8,100,23};
        sort(arr);
        printArray(arr);
    }
}
