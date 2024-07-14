package com.hubberspot.algorithms.linkedlist;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InsertNewNodeStartOfSinglyLinkedList {

    private static ListNode head;
    public static Scanner sc = new Scanner(System.in);


    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        InsertNewNodeStartOfSinglyLinkedList addNew = new InsertNewNodeStartOfSinglyLinkedList();
        System.out.print("Enter no of node you want to add --> ");
        int nos = sc.nextInt();
        insertNewnode(nos);
        isDisplay();

    }

    //algo for add new node into singly linkedList
    public static void insertNewnode(int nos) {
        for (int i = 0; i < nos; i++) {
            System.out.println("Enter data into Node");
            int nodeData = sc.nextInt();
            ListNode newNode = new ListNode(nodeData);
            newNode.next = head;
            head = newNode;
        }


    }

    public static void isDisplay() {
        ListNode current = head;
        while (current != null) {
            System.out.print(" --> " + current.data);
            current = current.next;
        }
        System.out.print(" null");


    }

}
