/*
Search in a LinkedList
Description
You are given a linked list. You need to check if a node with the data of k is present in that Linked List. If a node with data of k is present in the given Linked List, return “true” else return “false”.

Example:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> null
k = 11
Output: true

Linked List = 9 -> 3 -> 14 -> 22 -> 1 -> -6 -> 18 -> 15 -> null
k = 13
Output: false

Input: The input will be in the following format :
The first line should be the number of elements in the Linked List.
The second line should be the elements of the Linked List space separated.
The third line should be the value of k.
Note: You need to search if a node with the data equal to k is present in the given Linked List and return true if present else return false , need not to print anything. The stub code will print the output.

Example:
Input:
9
5 8 2 15 6 25 1 11 13
11

 */
package com.company.linkedlists;

import java.util.Scanner;

public class SearchInLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static boolean searchElementInLinkedList(int value){
        if(head == null){
            return false;
        }
        boolean flag = false;
        Node temp = head;
        while(temp.next!=null){
            if(value == temp.data){
                flag = true;
                return flag;
            }
            temp = temp.next;
        }

        return flag;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        head = null;

        if (n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i < n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        int k = sc.nextInt();
        System.out.println(searchElementInLinkedList(k));
    }
}
