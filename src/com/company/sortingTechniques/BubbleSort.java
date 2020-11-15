/*
Bubble Sort Algorithm
 */
package com.company.sortingTechniques;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int length = arr.length;
        for(int i = 0; i<length-1; i++){
            for (int j = 1; j<(length-i); j++){
                if(arr[j-1]>arr[j]){
                    swap(j-1,j,arr);
                }
            }
        }
    }

    public static void swap(int i, int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void printArray(int[]arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,14,2,8,100,23};
        bubbleSort(arr);
        printArray(arr);
    }
}

