package com.company.sortingTechniques;

public class BinarySearch {

    public static int binarySearch(int[]arr, int key){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + ((end - start) / 2);
            if(key == arr[mid]){
                return mid;
            }
            if(key < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,12,34,55,78};
        System.out.println("The key is at position : " +binarySearch(arr, 12));
    }
}
