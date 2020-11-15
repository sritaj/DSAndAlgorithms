/*
Function to check if a singly linked list is palindrome
Given a singly linked list of characters, write a function that returns true if the given list is a palindrome, else false.
 */
package com.company.linkedlists;

import java.util.Stack;

public class isPalindromeUsingStack {

    static Node head;

    static class Node{
        char data;
        Node next;

        Node(char data){
            this.data = data;
            next = null;
        }

    }

    public static void add(char data){

        Node newData = new Node(data);

        if(head == null){
            head = newData;
            head.next = null;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newData;
        }

    }

    public static Node getHead(){
        if(head == null){
            return null;
        }

        return head;

    }

    public static Stack addToStack(Node head){
        ;
        Stack<Character> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        System.out.println(stack.peek());
        return stack;
    }

    public static boolean isPalindrome(Node head, Stack stack){
        if(head == null){
            return false;
        }
        if(stack.isEmpty()){
            return false;
        }

        while(stack.isEmpty()==false){
            char c1 = (char) stack.peek();
            char c2 = head.data;
            if(c1 != c2){
                return false;
            }
            stack.pop();
            head = head.next;
        }

        return true;
    }

    public static void display(){

        Node temp = head;
        if(head == null){
            return;
        }

        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        head = new Node('K');
        add('S');
        add('K');
        display();
        Stack stack = addToStack(head);
        System.out.print(isPalindrome(head, stack));





    }
}
