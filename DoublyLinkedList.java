package com.company.DoublyLinkedList;

//1. Create a new node
//2. Insertion at the beginning
//3. Insertion at the end
//4. Deletion
//5. Search
//6. Reverse
//7. Traversal

class DoublyLinkedList {

    Node head;

    static class Node{
        int data;
        Node prev, next;

        Node(int d)
        {
            data = d;
            prev = next = null;
        }
    }

    void insertBeg(int data)
    {
        Node new_node = new Node(data);
        new_node.prev = null;
        new_node.next = head;
        if(head != null)
            head.prev = new_node;
        head = new_node;
    }

    void insertEnd(int data)
    {
        Node new_node = new Node(data);
        Node temp = head;
        if(head == null)
        {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }

    void deleteNode(int key)
    {
        Node temp = head;
        if(temp == null)
            System.out.println("List is empty!");
        if(temp!=null && temp.data == key)
        {
            temp.next.prev = temp.prev;
        }
        while(temp!=null && temp.data != key)
        {
            temp = temp.next;
        }
        if(temp!=null)
        {
            temp.prev.next = temp.next;
        }
    }

    void reverseList()
    {
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        while(temp!=null)
        {
            System.out.print(temp.data+"<-");
            temp = temp.prev;
        }
        System.out.println();
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.insertBeg(10);
        myList.insertBeg(20);
        myList.insertBeg(30);
        myList.printList();
        myList.insertEnd(200);
        myList.insertEnd(303);
        myList.printList();
        myList.deleteNode(200);
        myList.printList();
        myList.reverseList();
    }
}

