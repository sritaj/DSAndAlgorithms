/*
Delete the node at the given index
Description
You are given a linked list and a non-negative integer index. You need to delete the node at the given index of the Linked List.

 */
package com.company.linkedlists;

import java.util.Scanner;

public class DeleteNodeAtGivenIndex {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

        public static void deleteNodeAtGivenIndex(int index){

            int n= 0;
            if(index == 0){
                if(head == null){
                    return;
                }if(head.next != null){
                    Node temp = head.next;
                    head = null;
                    head = temp;
                    return;
                }
            }else{

                /*
                Node temp = head;
                for(int i = 0; temp.next!=null && i < index-1; i++ ){
                    temp = temp.next;
                }
                System.out.print(temp.data);
                Node next = temp.next.next;
                temp.next = next;

                 */

                Node current = head;
                while(current.next!=null && n<index-1){
                    n++;
                    current = current.next;

                }
                Node temp = current.next.next;
                current.next = null;
                current.next = temp;

            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n>0){
                head = new Node(sc.nextInt());
                Node temp = head;
                for(int i = 1; i<n; i++){
                    temp.next = new Node(sc.nextInt());
                    temp = temp.next;
                }
            }
            int index = sc.nextInt();

            deleteNodeAtGivenIndex(index);

            while(head!=null) {
                System.out.print(head.data + " -->");
                head = head.next;
            }
            System.out.print("Null");

        }

    }
}
