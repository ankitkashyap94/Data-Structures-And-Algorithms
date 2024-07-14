package com.hubberspot.algorithms.linkedlist;

import java.util.List;
import java.util.Scanner;

public class InsertNodeAtGivenPosition {

    public ListNode head;



    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        InsertNodeAtGivenPosition atGive = new InsertNodeAtGivenPosition();
        atGive.head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(13);
        ListNode forth = new ListNode(115);
        ListNode fifth = new ListNode(22);
        ListNode sixth = new ListNode(25);
        ListNode seventh = new ListNode(6);

        atGive.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = null;

        atGive.insertNodeAtGiven(8, 5);
        atGive.isDisplay();
        atGive.insertNodeAtGiven(26, 8);
        atGive.isDisplay();

    }

    public void insertNodeAtGiven(int data, int pos){

        ListNode node = new ListNode(data);

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

    public void isDisplay(){
        ListNode current = head;
        while(current.next != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

}
