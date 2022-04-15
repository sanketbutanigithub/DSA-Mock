package com.graph;

import java.util.Stack;

public class DSA2Hard {

    public static void main(String[] args) {
        mylist mylist1 = new mylist();
        mylist1.add(4);
        mylist1.add(5);
        mylist1.add(3);
        mylist1.add(2);
        mylist1.add(3);
        mylist1.add(5);
        mylist1.add(4);
        mylist1.print();
        System.out.println("");
        mylist1.isPalindrom();
    }
}

class mylist{
    Node head;
    public void add(int data){
        Node newnode= new Node(data);
        if(head == null){
            head = newnode;
        }else {
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void isPalindrom(){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        boolean ispalidrom = false;

        while(temp != null){
            stack.add(temp.data);
            temp = temp.next;
        }

        Node temp1 = head;
        while (temp1 != null){
            int i = stack.pop();
            if(i == temp1.data){
                ispalidrom = true;
            }else {
                ispalidrom = false;
                break;
            }
            temp1 = temp1.next;
        }

        if(ispalidrom){
            System.out.println("List is palindrom");
        }else {
            System.out.println("List is not palindrom");
        }

    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
