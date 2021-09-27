package com.company.StacksDemo;

class Stack{
    static final int MAX = 100;
    int[] arr = new int[100];
    int top;

    Stack(){
        top=-1;
    }

    boolean push(int data)
    {
        if(isFull())
        {
            System.out.println("Overflow!");
            return false;
        }
        else
        {
            arr[++top] = data;
            return true;
        }
    }

    boolean isEmpty(){
        return (top < 0);
    }

    boolean isFull(){
        return (top + 1 > MAX-1);
    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!");
            return 0;
        }
        else
        {
            int temp = arr[top];
            top--;
            return temp;
        }
    }

    void printStack()
    {
        for(int i=top; i>-1; i--)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    boolean searchStack(int key)
    {
        boolean check = false;
        for(int i=top; i>-1; i--)
        {
            if(arr[i] == key)
                check = true;
        }
        return check;
    }


    void reverseStack()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.printStack();
        System.out.println("Reverse : ");
        myStack.reverseStack();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.printStack();
        if(myStack.searchStack(50))
            System.out.println("10 found!");
        else
            System.out.println("10 not found!");
        myStack.reverseStack();
    }
}
