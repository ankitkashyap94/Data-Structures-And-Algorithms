package com.hubberspot.algorithms.linkedlist;

public class FindLenghtOfSinglyLinkedList {

    //this is an instance variable
    private static ListNode head;

    public static class ListNode{

        // declaring int datatype for holding data;
        private static int data;

        //declaring ListNode for connecting to all nodes using next;
        private ListNode next;

        private ListNode(int data) {
           this.data = data;
           this.next = null;
        }

        public static void main(String[] args) {

            FindLenghtOfSinglyLinkedList fl = new FindLenghtOfSinglyLinkedList();

            //Declaration of nodes into linkedList and adding data into it.
            fl.head = new ListNode(10);
            ListNode second = new ListNode(8);
            ListNode third = new ListNode(11);
            ListNode forth = new ListNode(12);
            ListNode fifth = new ListNode(20);

            //Connecting Nodes
            head.next = second;
            second.next = third;
            third.next = forth;
            forth.next = fifth;
            //fifth.next = null;
            isDisplay();
            isLength();


        }

        private static void isLength(){

            int count = 0;
            ListNode current;

            current = head;

            while(current != null){
                count++;
                current = current.next;
            }
            System.out.println(count);
        }


        private static void isDisplay(){

           ListNode current = head;
            while(current != null){
                System.out.print(" --> " + current.data);
                current  = current.next;
            }
            System.out.print(" null");
        }



    }


}
