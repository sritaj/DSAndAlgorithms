/*
Description
Write a bubble sort program that prints the number of swaps made after M number of iterations (In this case, ‘M’ should be an input value).

For example, if M = 0, the bubble sort program will perform 0 swaps in 0 iterations.

In bubble sort, an iteration is defined as the total number of times the outer loop runs. Assume that:
1) M <= the array size and
2) the program sorts in descending order.

The code should ask the user to input the values for M, the array size, and finally the elements of the array. So, there will be three types of inputs —

Input 1: The value of M
Input 2: The size of the array
Input 3: The elements inside the array

Sample Input:
2
4
1
2
3
4

Sample Output:
5

In this input, the first two numbers denote the values for M and the size of the array, respectively. And rest of the numbers denote the elements inside the array.

 */
package com.company.sortingTechniques;

import java.util.Scanner;

public class BubbleSort_NoOfSwaps {

    public static int bubbleSortSwaps(int m, int[]arr){

        if(m>arr.length){
            return -1;
        }

        int swapCount = 0;
        int noOfIterations = 0;

        for (int i = 0; i <arr.length; i++){
            for(int j = 1; j<(arr.length-i);j++){
                if(arr[j-1]<arr[j]){
                    swap(j-1,j,arr);
                    swapCount++;
                }
            }
            noOfIterations++;
            if(noOfIterations == m){
                break;
            }
        }
        return swapCount;
    }

    public static void swap(int i, int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();

        int n = input.nextInt();
        int i = 0;
        int[] arr = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(bubbleSortSwaps(m, arr));
    }
}
