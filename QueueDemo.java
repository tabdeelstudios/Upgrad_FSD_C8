package com.company.QueueDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	    Queue<Integer> myQueue = new LinkedList<Integer>();

	    //enqueue
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        System.out.println("The queue contains : "+ myQueue);

        //dequeue
        myQueue.remove();
        myQueue.remove();
        for(Object i : myQueue)
            System.out.print(i+" ");
        System.out.println();

        //search
        if(myQueue.contains(10))
            System.out.println("10 found!");
        else
            System.out.println("10 not found!");

        //traversal

        Iterator myIterator = myQueue.iterator();
        while(myIterator.hasNext())
            System.out.print(myIterator.next());
        System.out.println();

    }
}
