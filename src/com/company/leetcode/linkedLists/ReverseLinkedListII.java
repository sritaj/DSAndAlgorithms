package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class ReverseLinkedListII {

    static Node head;

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node reverseBetween(Node head, int startPoint, int endPoint) {

        if (head == null) {
            return null;
        }

        if (endPoint < startPoint) {
            return null;
        }

        if(startPoint==endPoint){
            return head;
        }

        /*
        Node preStart = head;
        Node postEnd = null;
        Node current = head;
        int sp = 1;
        while (sp<startPoint){
            current = current.next;
            sp++;
        }

        Node end = current;
        int ep = sp;

        while(ep<endPoint){
            end = end.next;
            ep++;
        }
        postEnd = end.next;

        Node reverseStruct = reverse(current, end);


        return head;

         */
        return head;
    }

    public static Node reverse(Node startPoint, Node endPoint){
        Node current = startPoint;
        Node end = endPoint.next;
        Node next = null;
        Node previous = null;
        while(current!=end) {
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
        head = null;
        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }

        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        display(head);

        Node newData = reverseBetween(head, startIndex, endIndex);
        display(newData);



    }
}
