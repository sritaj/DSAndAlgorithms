/*
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class MergeTwoSortedListsUsingRecursion {

    static Node firstHead;
    static Node secondHead;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeTwoLists(Node firstHead, Node secondHead) {

        if(firstHead==null){
            return secondHead;
        }
        if (secondHead==null){
            return firstHead;
        }

        if(firstHead.data<secondHead.data){
            firstHead.next = mergeTwoLists(firstHead.next, secondHead);
            return firstHead;
        }else{
            secondHead.next = mergeTwoLists(firstHead,secondHead.next);
            return secondHead;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        firstHead = null;
        if(n1>0){
            firstHead = new Node(sc.nextInt());
            Node temp = firstHead;
            for(int i = 1; i<n1; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        secondHead = null;
        int n2 = sc.nextInt();
        if(n2>0){
            secondHead = new Node(sc.nextInt());
            Node temp = secondHead;
            for(int i = 1; i<n2; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        display(firstHead);
        display(secondHead);
        Node newResult = mergeTwoLists(firstHead,secondHead);
        display(newResult);
    }
}
