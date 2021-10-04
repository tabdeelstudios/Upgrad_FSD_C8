package com.company.TreeJavaLL;

class BinarySearchTree{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;
    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(int data)
    {
        Node newNode = new Node(data);

        //check if empty
        if(root == null)
        {
            root = newNode;
            return;
        }
        else
        {
            Node current = root, parent = null;

            while(true)
            {
                parent = current;

                if(data <= current.data)
                {
                    current = current.left;
                    if(current==null)
                    {
                        parent.left = newNode;
                        return;
                    }
                }
                else
                {
                    current = current.right;
                    if(current==null)
                    {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node minNode(Node root)
    {
        if(root.left != null)
            return minNode(root.left);
        else
            return root;
    }

    public Node delete(Node node, int value)
    {
        if(root==null)
            return null;
        else
        {
            if (value < node.data)
            {
                node.left = delete(node.left, value);
            }
            else if(value > node.data)
            {
                node.right = delete(node.right, value);
            }
            else
            {
                if(node.left == null && node.right == null)
                {
                    node = null;
                }
                else if(node.left == null)
                {
                    node = node.right;
                }
                else if(node.right == null)
                {
                    node = node.left;
                }
                else {
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = delete(node.right, temp.data);
                }
            }
            return node;
        }
    }

    public void inOrder(Node node)
    {
        if(root == null) {
            System.out.println("Tree is empty!");
            return;
        }
        else
        {
            if(node.left!=null)
                inOrder(node.left);
            System.out.print(node.data+" ");
            if(node.right != null)
                inOrder(node.right);
        }

    }
}

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.insert(50);
        myTree.insert(72);
        myTree.insert(36);
        myTree.insert(99);
        myTree.insert(13);

        myTree.inOrder(myTree.root);
        System.out.println();
        myTree.delete(myTree.root, 72);
        System.out.println();
        myTree.inOrder(myTree.root);
    }
}
