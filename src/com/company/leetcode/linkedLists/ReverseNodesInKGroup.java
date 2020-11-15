/*
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

Example:

Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5


 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class ReverseNodesInKGroup {
    static Node head;

     static class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             next = null;
         }
     }

     public static void display(Node head){
         if(head == null){
                return;
         }

         Node current = head;
         while(current!=null){
             System.out.print(current.data + " --> ");
             current = current.next;
         }
         System.out.println();
     }

     public static Node reverseInKGroup(Node head, int k){
         if(head == null){
             return null;
         }

         Node temp = head;
         int token = 0;
         while(temp!=null){
             token++;
             temp = temp.next;
         }
         if(k>token){
             return head;
         }else{
             int counter = 0;
             Node current = head;
             Node previous = null;
             Node next = null;

             while(current!=null && counter<k){
                 next = current.next;
                 current.next = previous;
                 previous = current;
                 current = next;
                 counter++;
             }

             if(next!=null){
                 head.next = reverseInKGroup(next, k);
             }
             return previous;
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
                 temp. next = new Node(sc.nextInt());
                 temp = temp.next;
             }
         }

         display(head);
         Node newData = reverseInKGroup(head, 2);
         display(newData);

     }

}

