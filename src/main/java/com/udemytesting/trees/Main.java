package com.udemytesting.trees;

/**
 * @author nnkipkorir
 * created 18/01/2025
 */

public class Main {
    public static void main(String[] args) {

        //crete tree data
        Node data = createData();

       // preOrderTraversal(data);
        postOrderTraversal(data);

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
