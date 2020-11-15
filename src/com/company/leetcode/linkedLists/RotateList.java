/*
Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class RotateList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node rotateList(Node head, int k){
        if(k == 0){
            return head;
        }
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        Node tail = head;
        int count = 1;
        while(tail.next!=null){
            count++;
            tail = tail.next;
        }
        tail.next = head;

        if(k>count){
            return head;
        }

        k%=count;

        for(int i = 0;i < count-k; i++){
            tail =tail.next;
        }
        Node newHead =tail.next;
        tail.next=null;

        return newHead;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        head = null;

        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        int k = sc.nextInt();

        display(head);
        Node newVal = rotateList(head, 2);
        display(newVal);
    }


}

