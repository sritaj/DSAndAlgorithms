/*
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.



Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class MiddleOfLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node middleNode(Node head){
        if(head == null){
            return null;
        }

        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        Node current = head;
        int middle = Math.round(count/2);

        while(current.next!=null && middle > 0){
            current = current.next;
            middle--;
        }

        return current;
    }

    public static void display(){
        if(head == null){
            return;
        }

        Node current = head;
        while(current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
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
        Node result = middleNode(head);

        System.out.println(result.data);
    }
}
