/*
Insert a node at the given index
Description
You are given a linked list, an integer k and a non-negative integer index. You need to insert a node with data value k at the given index of the given linked list and print the elements of the linked list.

Note: Follow zero-based indexing.
Note: If the number of elements in the given Linked List is less than ‘index’, insert at the end of the Linked List.

Example:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> null
k = 50
index = 4
Output:
Linked List = 5 -> 8 -> 2 -> 15 -> 50 -> 6 -> 25 -> 1 -> 11 -> 13 -> null

Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> null
k = 50
index = 15
Output:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> 50 -> null

Input: The input will be in the following format :
The first line should be the number of elements in the Linked List.
The second line should be the elements of the Linked List space separated.
The third line should be the value of k.
The fourth line should be the value of the index at which node to be inserted.
Note: You just need to insert a node with a data value of k at the given index of the given linked list and need not print anything. The stub code will print the elements of the linked list.

Example:
Input:
9
5 8 2 15 6 25 1 11 13
50
4
 */
package com.company.linkedlists;

import java.util.Scanner;

public class InsertNodeAtGivenIndex {

    static Node head;

    static  class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void insertAtIndex(int value, int index){

        Node node = new Node(value);
        int i = 0;

        if(index == 0){
            if (head == null){
                head = node;
                return;
            }else{
                Node temp = head;
                head = node;
                head.next = temp;
                return;
            }
        }else{
            Node current = head;
            while(current.next!=null && i < index-1){
                current = current.next;
                i++;
            }


            node.next = current.next;
            current.next = node;
        }
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

        int value = sc.nextInt();
        int index = sc.nextInt();

        insertAtIndex(value, index);

        while(head!=null){
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.print("NULL");

    }
}
