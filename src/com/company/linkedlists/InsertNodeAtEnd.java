/*
Insert a node at the end of the LinkedList
Description
You are given a linked list and an integer k. You need to insert a node with data value k at the end of the given linked list.

Example:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> null
k = 50
Output:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> 50 -> null

Input: The input will be in the following format :
The first line should be the number of elements in the Linked List.
The second line should be the elements of the Linked List space separated.
The third line should be the value of k.
Note: You just need to insert a node with a data value of k at the end of the given linked list and need not print anything. The stub code will print the elements of the linked list.

Example:
Input:
9
5 8 2 15 6 25 1 11 13
50
 */
package com.company.linkedlists;

import java.util.Scanner;

public class InsertNodeAtEnd {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

    }

    public static void insertAtEndOfNode(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }

        temp.next = node;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        head = null;

        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;

            for (int i = 1; i < n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        insertAtEndOfNode(100);

        while(head!=null){
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.print("NULL");


    }
}
