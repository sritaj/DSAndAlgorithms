/*
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
 */
package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class AddTwoNumbers2 {

    static Node head1;
    static Node head2;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node addTwoNumbersLinkedList(Node l1, Node l2){
        Node newNode = new Node(-1);
        Node ptr = newNode;
        int v1, v2, sum, carry = 0;

        Node l1Reverse = reverse(l1);
        Node l2Reverse = reverse(l2);

        while(l1Reverse!=null || l2Reverse!=null){
            if(l1Reverse!=null){
                v1 = l1Reverse.data;
                l1Reverse = l1Reverse.next;
            }else{
                v1 = 0;
            }

            if(l2Reverse!=null){
                v2 = l2Reverse.data;
                l2Reverse = l2Reverse.next;
            }else{
                v2 = 0;
            }

            sum = v1+v2+carry;

            carry = sum/10;
            sum = sum%10;
            Node temp = new Node(sum);
            ptr.next = temp;
            ptr = ptr.next;

        }

        if(carry!=0){
            Node temp = new Node(carry);
            ptr.next = temp;

        }

        Node finalValue = reverse(newNode.next);

        return finalValue;

    }
    /*
    public static Node addTwoNumbers(Node l1, Node l2){
        if(l1==null && l2!=null){
            return l2;
        }

        if(l1!=null && l2==null){
            return l1;
        }

        if(l1==null && l2==null){
            return null;
        }

        Node tempL1 = l1;
        String l1Value = "";
        while(tempL1!=null){
            l1Value = l1Value + tempL1.data;
            tempL1 = tempL1.next;
        }

        Node tempL2 = l2;
        String l2Value = "";
        while(tempL2!=null){
            l2Value = l2Value + tempL2.data;
            tempL2 = tempL2.next;
        }

        int valueOfL1 = Integer.parseInt(l1Value);
        int valueOfL2 = Integer.parseInt(l2Value);

        int sum = valueOfL1 + valueOfL2;

        Node head = null;
        Node tail = null;
        if(sum == 0){
            return head = new Node(sum);
        }else{
            while(sum>0){

                int value = sum%10;
                sum = sum/10;
                if(head==null){
                    head = new Node(value);
                    tail = head;
                }else{
                    tail.next = new Node(value);
                    tail = tail.next;
                }
            }
        }
        Node reverseValue = reverse(head);
        return reverseValue;
    }

     */

    public static Node reverse(Node head){
        if(head == null){
            return null;
        }

        Node current = head;
        Node previous = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
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
        head1 = null;

        int n = sc.nextInt();

        if(n>0){
            head1 = new Node(sc.nextInt());
            Node temp = head1;

            for(int i = 1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }

        }
        int m = sc.nextInt();

        if(m>0){
            head2 = new Node(sc.nextInt());
            Node temp = head2;

            for(int i = 1; i<m; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }

        }

        display(head1);
        display(head2);

        /*
        Node newValue = addTwoNumbers(head1, head2);

        display(newValue)

         */

        Node newVal = addTwoNumbersLinkedList(head1, head2);
        display(newVal);


    }
}


