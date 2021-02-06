package com.company;

import java.io.*;
import java.util.*;

public class Solution {

    static void levelOrder(Node root) {

        ArrayList<Node> nodeList = new ArrayList<>();

        nodeList.add(root);

        int i = 0;
        do {
            Node node = nodeList.remove(i);
            System.out.print(node.data + " ");
            if (node.left != null) {
                nodeList.add(node.left);
            }
            if (node.right != null) {
                nodeList.add(node.right);
            }
        } while (!nodeList.isEmpty());


        /*
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.peek()!=null) {
            Node node =queue.remove();
            System.out.print(" "+ node.data+ " ");
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }*/
    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);


    }
}

// Casos de prueba
// caso 1:  6 3 5 4 7 2 1  ---> Respuesta 3 2 5 1 4 7
// caso 2:  9 20 50 35 44 9 15 62 11 13 --> Respuesta: 20 9 50 15 35 62 11 44 13
// 13 25 39 12 19 9 23 55 31 60 35 41 70 90 Respuesta: 25 12 39 9 19 31 55 23 35 41 60 70 90