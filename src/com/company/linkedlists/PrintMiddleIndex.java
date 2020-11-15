/*
Given a singly linked list, find middle of the linked list. For example, if given linked list is 1->2->3->4->5 then output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
 */
package com.company.linkedlists;

public class PrintMiddleIndex {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            Node next = null;
        }
    }

    public static void add(int data){
        Node newData = new Node(data);

        if(head == null){
            head = newData;
        }else{
            Node temp = head;
            while(temp.next!=null){
               temp = temp.next;
           }
            temp.next = newData;
        }
    }

    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void middleElement(){
        if(head == null){
            System.out.print("No Elements present in the list");
            return;
        }

        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }

        int midElement = Math.round(count/2);

        Node currentElement = head;
        while(currentElement.next!=null && midElement > 0){
            currentElement = currentElement.next;
            midElement--;
        }
        System.out.println("Middle Element in current LinkedList is " +currentElement.data);

    }

    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        print();
        middleElement();


    }
}
