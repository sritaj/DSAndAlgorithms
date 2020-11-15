package com.company.linkedlists;

public class LinkedLists {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertAtBegining(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
            head.next = null;
        }else{
            Node temp = head;
            head = node;
            head.next = temp;
        }

    }

    public void insertAtEnd(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
            head.next = null;
        }else{
            Node end = head;
            while(end.next!= null){
                end = end.next;
            }
            end.next = node;
        }
    }



    public void display(){

        while(head!=null){
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {

        LinkedLists l = new LinkedLists();
        l.insertAtBegining(10);
        l.insertAtBegining(12);
        l.insertAtBegining(14);
        l.insertAtEnd(99);
        l.insertAtEnd(98);
        l.insertAtEnd(97);
        l.display();
    }
}
