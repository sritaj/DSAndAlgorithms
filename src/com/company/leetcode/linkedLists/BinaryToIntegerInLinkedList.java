/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.



Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
Example 3:

Input: head = [1]
Output: 1
Example 4:

Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880
Example 5:

Input: head = [0,0]
Output: 0
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class BinaryToIntegerInLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static int convertBinaryToInteger(Node head){
        if(head == null){
            return 0;
        }

        if(head.data == 1 && head.next == null){
            return 1;
        }

        if(head.data == 0 && head.next == null){
            return 0;
        }

        Node temp = head;
        String s = "";
        while(temp!=null){
            s = s + temp.data;
            temp = temp.next;

        }

        System.out.println(s);

        int sum = Integer.parseInt(s, 2);

        return sum;

        /*
        int num = head.data;
        while (head.next != null) {
            num = num * 2 + head.next.data;
            head = head.next;
        }
        return num;
         */
    }

    public static void display(){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        head = null;
        int n = sc.nextInt();

        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        display();

        int value = convertBinaryToInteger(head);

        System.out.println(value);
    }

}
