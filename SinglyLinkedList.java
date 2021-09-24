package com.company.SinglyLinkedList;

class SinglyLinkedList{
    //1. Create a new node
    //2. Insert a node in the list
    //3. Print the list (traversal)
    //4. Search for a specific node
    //5. Delete a node from the list

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void insertEnd(SinglyLinkedList list, int data)
    {
        Node new_node = new Node(data);
        //check if list is empty
        if(list.head == null)
            list.head = new_node;
        else
        {
            Node temp = list.head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new_node;
        }
    }

    void insertBeg(SinglyLinkedList list, int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
            list.head = new_node;
        else
        {
            new_node.next = head;
            list.head = new_node;
        }
    }

    void printList(SinglyLinkedList list)
    {
        Node temp = list.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteNode(SinglyLinkedList list, int key)
    {
        Node temp = list.head;
        Node prevNode = null;

        //if empty
        if(list.head == null)
            System.out.println("List is empty!");

        //if the head is to be deleted
        if(temp!=null && temp.data == key)
        {
            list.head = temp.next;
            System.out.println("Deleted "+key+" from the head!");
        }

        //if any other node is the key
        while(temp!=null && temp.data!=key)
        {
            prevNode = temp;
            temp = temp.next;
        }
        if(temp!=null)
        {
            if(prevNode!=null)
            {
                prevNode.next = temp.next;
                System.out.println("Deleted "+key+" from the list!");
            }
        }
    }

}

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertEnd(myList, 10);
        myList.insertEnd(myList, 20);
        myList.insertEnd(myList, 30);
        myList.printList(myList);
        myList.insertBeg(myList, 60);
        myList.insertBeg(myList, 1000);
        myList.printList(myList);
        myList.deleteNode(myList, 30);
        myList.printList(myList);
        myList.deleteNode(myList, 100);
        myList.printList(myList);
    }
}
