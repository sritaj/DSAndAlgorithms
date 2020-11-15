/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class RemoveDuplicatesII {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node removeDuplicates(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node dummy = new Node(-1);
        Node temp = dummy;
        boolean flag = true;

        while(head!= null){
            flag = true;

            while(head.next!= null && head.data == head.next.data){
                flag = false;
                head = head.next;
            }

            if(flag == true){
                temp.next = new Node(head.data);
                temp = temp.next;
            }

            head = head.next;
        }

        return dummy.next;
    }
    public static void display(Node head){
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
        int n = sc.nextInt();
        head =  null;
        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        display(head);

        Node newVal = removeDuplicates(head);

        display(newVal);

    }
}
