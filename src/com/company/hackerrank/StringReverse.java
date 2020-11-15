package com.company.hackerrank;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String reverseWord = "";

        for(int i = A.length()-1; i>=0; i--){
            reverseWord += A.charAt(i);
        }

        if(reverseWord.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
