package com.company.linkedlists;

import java.util.Scanner;

public class Reverse {

    static Node head;

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        head = null;

        int n = sc.nextInt();
        if(n>0){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i < n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
        }
        display(head);
        Node temp = reverse(head);
        display(temp);

    }
}
