package com.company.QueueDemo;

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Queue{

    Node front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    //enqueue
    void enqueue(int data)
    {
        Node temp = new Node(data);
        if(this.rear == null)
        {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    //dequeue
    int dequeue()
    {
        //check if empty
        if(this.front == null)
        {
            System.out.println("Queue is empty!");
            return 0;
        }

        //return the value
        int temp = this.front.data;

        //modify the front
        this.front = this.front.next;

        if(this.front == null)
        {
            this.rear = null;
        }
        return temp;
    }

    //print
    void printQueue()
    {
        if(this.front == null)
        {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

    //search

}

public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        //enqueue
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        //print
        myQueue.printQueue();

        //dequeue
        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.printQueue();

    }
}
