/*
Count the number of prime numbers less than a non-negative number, n.



Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 */
package com.company.leetcode;

public class CountPrimesSieveofEratosthenes {

    public static int countPrimesTillN(int n){

        if(n<2){
            return 0;
        }

        int count = 0;
        boolean isPrime[] = new boolean[n+1];

        for(int i = 2; i<n; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i<n; i++){

            if(isPrime[i]){
                count ++;

                for(int j = i; j*i<=n; j++){
                    isPrime[j*i] = false;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int count = countPrimesTillN(455);
        System.out.println(count);

    }
}
