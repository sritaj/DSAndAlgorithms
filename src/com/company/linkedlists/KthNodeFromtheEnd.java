/*
kth node from the end in a LinkedList
Description
You are given a Linked List and an integer k. You need to find the the value at kth node from the end of the Linked List.

Note: If k is greater than the total number of elements in the Linked List, print “Not Possible”.

Example:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> null
k = 4
Output: 25

Linked List = 9 -> 3 -> 14 -> 22 -> 1 -> -6 -> 18 -> 15 -> null
k = 13
Output: Not Possible

Input: The input will be in the following format :
The first line should be the number of elements in the Linked List.
The second line should be the elements of the Linked List space separated.
The third line should be the value of k.

Output: The output should be of the following format
Print value at the kth node from the end.
Note: If k is greater than the total number of elements in the Linked List, print “Not Possible”.

Example:
Input:
9
5 8 2 15 6 25 1 11 13
4
Output:
25

Input:
8
9 3 14 22 1 6 18 15
13
Output:
Not Possible
 */
package com.company.linkedlists;

import java.util.Scanner;

public class KthNodeFromtheEnd {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;

        }
    }

    public static void kthNodeFromEnd(int index){
        if(head == null){
            return;
        }

        int count = 1;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }

        if(index > count || index < 1){
            System.out.print("Not Possible");
            return;

        }else{
            int diff = count - index;
            Node current = head;

            while(current.next!=null & diff > 0){
                current = current.next;
                diff--;
            }

            System.out.print(current.data);


        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        head = null;
        int n = sc.nextInt();

        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;

            for(int i = 1; i < n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        int index = sc.nextInt();

        kthNodeFromEnd(index);


    }

}
