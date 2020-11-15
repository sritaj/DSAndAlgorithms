/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class AddTwoNumbers {

    static Node head1;
    static Node head2;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static Node reverse(Node head){
        if(head == null){
            return null;
        }

        Node current = head;
        Node previous =  null;
        Node next = null;
        while(current!= null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static Node addTwoLinkedLists(Node l1, Node l2){

        Node newNode = new Node(-1);
        Node iterator = newNode;

        int v1 = 0;
        int v2 = 0;
        int sum = 0;
        int carryForwardValue = 0;

        while(l1!=null || l2!=null){
            if(l1!=null){
                v1 = l1.data;
                l1 = l1.next;
            }else{
                v1 = 0;
            }

            if(l2!=null){
                v2 = l2.data;
                l2 = l2.next;
            }else{
                v2 = 0;
            }

            sum = v1+v2+carryForwardValue;
            carryForwardValue = sum/10;
            sum = sum%10;
            Node temp = new Node(sum);

            iterator.next = temp;
            iterator = iterator.next;
        }

        if(carryForwardValue!=0){
            Node temp = new Node(carryForwardValue);
            iterator.next = temp;
        }

        return newNode.next;
    }

    public static Node addTwoLists(Node l1, Node l2){
        if(l1==null || l2==null){
            return null;
        }
        String sumOfL1 = "";
        while(l1!=null){
            sumOfL1 += l1.data;
            l1 = l1.next;
        }
        String sumOfL2 = "";
        while(l2!=null){
            sumOfL2 += l2.data;
            l2 = l2.next;
        }


        int l1Number = Integer.parseInt(sumOfL1);
        int l2Number = Integer.parseInt(sumOfL2);
        int totalSum = (l1Number+l2Number);

        Node head = null;
        Node temp = null;

        if(totalSum == 0){
            return head = new Node(totalSum);
        }else{
            while (totalSum > 0) {

                int value = totalSum % 10;
                totalSum = totalSum / 10;
                if (head == null) {
                    head = new Node(value);
                    temp = head;
                } else {
                    temp.next = new Node(value);
                    temp = temp.next;
                }

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
        System.out.print("null");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        head1 = null;
        int n1 = sc.nextInt();
        if(n1>0){
            head1 = new Node(sc.nextInt());
            Node temp = head1;
            for(int i = 1; i<n1; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        int n2 = sc.nextInt();
        if(n2 > 0){
            head2 = new Node(sc.nextInt(), null);
            Node temp = head2;
            for(int i = 1; i<n2; i++){
                temp.next = new Node(sc.nextInt(), null);
                temp = temp.next;
            }
        }

        display(head1);
        Node newOrderHead1 = reverse(head1);
        display(newOrderHead1);

        display(head2);
        Node newOrderHead2 = reverse(head2);
        display(newOrderHead2);

        /*
        Node latestNode = addTwoLists(newOrderHead1, newOrderHead2);
        display(latestNode);

         */

        Node latestVal = addTwoLinkedLists(newOrderHead1, newOrderHead2);
        display(latestVal);



    }
}
