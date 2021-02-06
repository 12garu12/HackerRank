package com.company;

public class BTS {

    Node root;

    public BTS() {
        root = null;
    }

    // inorder tree walk metodo en ingles
    public void tourInOrder(Node x) { // El nodo x es para comemzar en el nodo raiz
        if (x != null) {
            tourInOrder(x.left);
            System.out.println(x.key);
            tourInOrder(x.right);
        }
    }

    public void insert(int key, Object value) {
        Node node = new Node(key);
        node.value = value;

        if (root == null) {
            root = node;
        } else {
            Node temporary = root;
            while (temporary != null) {

                node.parent = temporary;

                if (node.key >= temporary.key) {
                    temporary = temporary.right;
                } else {
                    temporary = node.parent.left;
                }
            }
            if (node.key >= node.parent.key) {
                node.parent.right = node;
            } else {
                node.parent.left = node;
            }
        }
    }

    private class Node {
        public int key;
        public Object value;
        public Node right;
        public Node left;
        public Node parent;

        public Node(int key) {
            this.key = key;
            this.value = null;
            this.right = null;
            this.left = null;
            this.parent = null;
        }
    }
}
