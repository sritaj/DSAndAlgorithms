/*
Write a code that returns the number of unsuccessful attempts made to search for an element in the array using Binary search.
The code should
Take the size of the array as an input from the user
The elements of the array as an input from the user
The key you are searching for as an input from the user
Sample Input:
5
2 3 4 5 8
8

Sample Output:
2
 */
package com.company.sortingTechniques;

import java.util.Scanner;

public class BinarySearch_NoOfUnsuccessfulAttempts {

    public static int binarySearchUnsuccessfulAttempts(int[]arr, int key){

        int start = 0;
        int end = arr.length-1;
        int noOfUnsucessfulAttempts = 0;

        while(start<=end){
            int mid = start + ((end - start) / 2);
            if(key != arr[mid]){
                noOfUnsucessfulAttempts++;
            }

            if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return noOfUnsucessfulAttempts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(binarySearchUnsuccessfulAttempts(array, key));
    }
}
