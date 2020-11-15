/*
Delete the last node of the LinkedList
Description
You are given a linked list. You need to delete the last node of the Linked List if present.

Example:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> 13 -> null
Output:
Linked List = 5 -> 8 -> 2 -> 15 -> 6 -> 25 -> 1 -> 11 -> null

Linked List = 13 -> null
Output:
Linked List = print nothing

Linked List = null
Output:
Linked List = print nothing

Input: The input will be in the following format :
The first line should be the number of elements in the Linked List.
The second line should be the elements of the Linked List space separated.
Note: You just need to delete the last node of the linked list and need not to print anything. The stub code will print the elements of the linked list.

Example:
Input:
9
5 8 2 15 6 25 1 11 13

 */
package com.company.linkedlists;

import java.util.Scanner;

public class DeleteNodeAtEnd {

    static Node head;

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

        public static void deleteLastNode(){
            if(head == null || head.next == null){
                return;
            }
            Node current = head;
            while(current.next.next!=null){
                current = current.next;
            }
            current.next = null;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            head = null;

            if (n > 0) {
                head = new Node(sc.nextInt());
                Node temp = head;

                for (int i = 1; i < n; i++) {
                    temp.next = new Node(sc.nextInt());
                    temp = temp.next;
                }
            }

            deleteLastNode();

            while(head!=null){
                System.out.print(head.data + " --> ");
                head = head.next;
            }
            System.out.print("Null");
        }

    }
}
