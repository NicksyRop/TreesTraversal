package com.udemytesting.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nnkipkorir
 * created 18/01/2025
 */

public class Main {
    public static void main(String[] args) {

        //crete tree data
        Node data = createData();

       // preOrderTraversal(data);
       // postOrderTraversal(data);
       // inOrderTraversal(data);

        levelOrderTraversal(data);


    }

    /**
     * level order traversal can be implemented using a queue , FIFO
     * Add the root node , while popping - add its left , right element to the queue
     *
     */
    public static void levelOrderTraversal(Node n) {
        Queue<Node> queue = new LinkedList<>();
        //add the root element
        queue.add(n);

        //use while loop
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            //print the value of the processed node
            System.out.println(current.value);
            //add left child
            if(current.left != null) {
                queue.add(current.left);
            }

            //add right
            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

    /**
     * Root , Left , Right
     * print value of n , recursively call left , then recursively call right
     * a,b,c,e,f,d,g
     * @param n
     */
    public static void preOrderTraversal(Node n) {
        //check for null value
        if (n == null) {
            return;
        }
        System.out.println(n.value + " ");

        //this will go left until we get null will stop at node e
        preOrderTraversal(n.left);
        // will be called with value n = e
        preOrderTraversal(n.right);

    }

    /**
     * Left , right , root
     * recursively call left , recursively call right , the print value on n
     * We change order of how we print we start at
     * @param n
     */
    public static void postOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.println(n.value + " ");
    }

    /**
     * Left, root , left
     * recursively call n.left , then print value of n , then recursively call right
     * @param n
     */

    public static void inOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        inOrderTraversal(n.left);
        System.out.println(n.value + " ");
        inOrderTraversal(n.right);
    }

    public static Node createData() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;


        return a;
    }
}
