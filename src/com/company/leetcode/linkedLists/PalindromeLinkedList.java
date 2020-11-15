package com.company.leetcode.linkedLists;

import java.util.Scanner;

public class PalindromeLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static boolean palindrome(Node head){
        if(head == null){
            return false;
        }

        Node slowNode = head;
        Node fastNode = head;

        while(fastNode.next!=null && fastNode.next.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        Node slowNodeHead = reverse(slowNode);
        Node fastNodeHead = head;

        while(slowNodeHead!=null && fastNodeHead!=null){
            if(slowNodeHead.data != fastNodeHead.data){
                return false;

            }
            slowNodeHead = slowNodeHead.next;
            fastNodeHead = fastNodeHead.next;
        }

        return true;

    }

    public static Node reverse(Node node){
        if(head == null){
            return null;
        }

        Node current = node;
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

    public static void display(){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        head = null;
        int n = sc.nextInt();

        if(n>1){
            head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1; i<n; i++){
                temp.next = new Node(sc.nextInt());
                temp = temp. next;
            }
        }

        display();

        System.out.println(palindrome(head));
    }
}
