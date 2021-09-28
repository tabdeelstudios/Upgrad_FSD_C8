package com.company.QueueDemo;

class Queue{
    private static int front, rear, size;
    private static int myQueue[];

    Queue(int customSize)
    {
        front=rear=-1;
        size=customSize;
        myQueue = new int[size];
    }

    //enqueue
    static void enqueue(int data)
    {
        if(rear==size-1)
        {
            System.out.println("Queue is full!");
            return;
        }
        else{
            myQueue[++rear]=data;
            if(front==-1)
                front++;
        }
    }

    //dequeue
    static int dequeue()
    {
        int temp = 0;
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty!");
            return 0;
        }
        else
        {
            temp = myQueue[front++];
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
        }
        return temp;
    }

    //print
    static void printQueue()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty!");
            return;
        }
        else
        {
            for(int i=front; i<=rear;i++)
            {
                System.out.print(myQueue[i]+" ");
            }
            System.out.println();
        }
    }

    //search
}

public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

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
