package com.hubberspot.algorithms.linkedlist;

import java.util.List;

public class SinglyLinkList {

    private ListNode head;


    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {

            //Creating Object of class
            SinglyLinkList ssl = new SinglyLinkList();

            //Creating nodes of Singly LinkedList
            ssl.head = new ListNode(10);
            ListNode second = new ListNode(8);
            ListNode third = new ListNode(5);
            ListNode forth = new ListNode(15);

            // Connecting node in row
            ssl.head.next = second;
            second.next = third;
            third.next = forth;
            ssl.isdisplay();

//            //Print node data
//            ListNode current = ssl.head;
//            while(current != null){
//                System.out.println(" --> " + current.data);
//                current  = current.next;
//            }
//            System.out.println("null");




        }

    }

    private void isdisplay() {
        ListNode current = head;
            while(current != null){
                System.out.print(" --> " + current.data);
                current  = current.next;
            }
            System.out.print(" null");
    }

}
