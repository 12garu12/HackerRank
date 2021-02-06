package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static Node insert(Node head, int data) {
        Node node = new Node(data);
        Node newHead = head;
        if (head == null) {
            head = node;
            return head;
        }
        while (newHead.next != null) {
            newHead = newHead.next;
        }
        newHead.next = node;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = 4;
        int[] a = {1, 4, 3, 2};

        while (N-- > 0) {
            int ele = a[N];
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
