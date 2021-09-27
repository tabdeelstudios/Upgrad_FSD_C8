package com.company.StacksDemo;

class Stack{

    class Node{
        int data;
        Node next;
    }

    Node top;

    Stack()
    {
        this.top = null;
    }

    void push(int data)
    {
        Node temp = new Node();
        if(temp == null)
        {
            System.out.println("Overflow!");
            return;
        }
        temp.data = data;
        temp.next = top;
        top = temp;
    }

    int pop()
    {
        if(top==null)
        {
            System.out.println("Underflow!");
            return 0;
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    void display()
    {
        if(top==null)
        {
            System.out.println("Underflow!");
            return;
        }
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    boolean searchStack(int key)
    {
        boolean check = false;
        if(top==null)
        {
            System.out.println("Underflow!");
            return false;
        }
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                if(temp.data == key)
                {
                    check = true;
                }
                temp = temp.next;
            }
            return check;
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();
//        System.out.println("Reverse : ");
//        myStack.reverseStack();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.display();
        if(myStack.searchStack(50))
            System.out.println("10 found!");
        else
            System.out.println("10 not found!");
//        myStack.reverseStack();
    }
}
