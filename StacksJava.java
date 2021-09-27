package com.company.StacksDemo;

import java.util.Stack;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.pop());

        System.out.println(myStack.peek());

        if(myStack.isEmpty())
            System.out.println("Stack is empty!");

        System.out.println(myStack);

//        for(Object i : myStack)
//            System.out.print(i+" ");
//        System.out.println();

//        Iterator print = myStack.iterator();
//        while(print.hasNext())
//            System.out.print(print.next() + " ");
//        System.out.println();

    }
}
