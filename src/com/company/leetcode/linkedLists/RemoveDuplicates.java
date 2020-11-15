/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class RemoveDuplicates {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

    }

    public static void deleteDuplicates(Node head){
        if(head == null){
            return;
        }

        Node current = head;
        while(current!=null && current.next!=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }

        }
    }

    public static void display(){
        if(head == null){
            return;
        }

        Node current = head;
        while(current!=null){
            System.out.print(current.data + " -- > ");
            current = current.next;
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
        deleteDuplicates(head);
        display();


    }
}
