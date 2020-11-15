/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class RemoveLinkedListElements {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node removeElement(Node head, int value){
        if(head==null){
            return null;
        }

        if(head.next == null && head.data != value){
            return head;
        }

        if(head.data ==value && head.next == null){
            return null;
        }

        while(head.data==value){
            if(head.next!=null){
                head = head.next;
            }else{
                return null;
            }
        }

        Node current = head;

        while(current.next!=null){
            if(current.next.data!=value){
                current = current.next;
            }else {
                Node temp = current.next.next;
                current.next = temp;

            }

        }

        return head;
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
        head = null;

        int n = sc.nextInt();
        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i =1; i<n;i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        display(head);

        Node result = removeElement(head,1);

        display(result);
    }
}
