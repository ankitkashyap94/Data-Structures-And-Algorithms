package com.hubberspot.algorithms.linkedlist;

public class InsertNodeAtEnd {

    private static ListNode head;

    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void insertNodeAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public static void isDisplay() {

        ListNode current = head;
        while (current != null) {
            System.out.print("--> " + current.data);
            current = current.next;

        }
        System.out.print(" null");

    }

    public static void main(String[] args) {
        InsertNodeAtEnd endNode = new InsertNodeAtEnd();
        insertNodeAtEnd(5);
        isDisplay();

    }

}
