package com.company.TreeJavaLL;

class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = null;
        right = null;
    }
}

class MyBinaryTree{
    Node root;
    MyBinaryTree(int d)
    {
        root = new Node(d);
    }

    MyBinaryTree()
    {
        root = null;
    }

    void printInorder(Node node)
    {
        if(node==null)
            return;

        printInorder(node.left);

        System.out.print(node.data + " ");

        printInorder(node.right);

    }

    void printPreorder(Node node)
    {
        if(node==null)
            return;

        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);

    }

    void printPostorder(Node node)
    {
        if(node==null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");

    }

}

public class Main {

    public static void main(String[] args) {
        MyBinaryTree myTree = new MyBinaryTree();
        myTree.root = new Node(2);
        myTree.root.left = new Node(3);
        myTree.root.right = new Node(4);

        myTree.root.left.left = new Node(5);
        myTree.root.left.right = new Node(6);

        myTree.root.right.right = new Node(8);

        myTree.printInorder(myTree.root);
        System.out.println();
        myTree.printPreorder(myTree.root);
        System.out.println();
        myTree.printPostorder(myTree.root);

        /*

        left root right

                    2
                 3     4
               5   6      8

         */

    }
}
