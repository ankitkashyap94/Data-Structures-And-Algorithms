package com.hubberspot.algorithms;

public class Practice1 {

    public static ListNode head;

    public class ListNode {
        private int data;
        private ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        int[] nodes = {45,52,88,21,12};

        Practice1 prac = new Practice1();

        for(int node:nodes){
            prac.insertLast(node);
        }
        prac.isDisplay();
    }

    //Logic to insert node at last of singly linked list
    public void insertLast(int i) {
        ListNode newNode = new ListNode(i);
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

    //InsertNode at given Position
    public void insertAtGivenPosition(int i, int pos){

        ListNode node = new ListNode(5);

        if(pos == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < pos-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
           previous.next = node;
        }

    }








    public void isDisplay() {

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

    }
}
