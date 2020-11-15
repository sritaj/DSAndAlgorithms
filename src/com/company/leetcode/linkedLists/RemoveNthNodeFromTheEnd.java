/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?



Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class RemoveNthNodeFromTheEnd {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node delete(Node head, int index){
        if(head == null){
            return null;
        }

        if(index == 0){
            return head;
        }

        Node newNode = new Node(-1);
        newNode.next = head;
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        if(index>count){
            return null;
        }

        int diff = count - index;

        temp = newNode;

        while(diff>0){
            temp = temp.next;
            diff--;
        }

        temp.next = temp.next.next;

        return newNode.next;
    }
    public static void display(Node node){
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
            for(int i=1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;

            }
        }

        int index = sc.nextInt();

        display(head);

        Node value = delete(head, index);

        display(value);


    }
}
