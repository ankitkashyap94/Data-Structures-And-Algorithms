package com.hubberspot.algorithms.linkedlist;

public class DeleteFirstNodeInLinkList {

    private static ListNode head;

    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        DeleteFirstNodeInLinkList dfn = new DeleteFirstNodeInLinkList();

        dfn.head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(15);

        dfn.head.next = second;
        second.next = third;
        third.next = null;

        isDisplay();
        System.out.println(deleteFirstNode().data);
        isDisplay();

    }

    public static ListNode deleteFirstNode(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void isDisplay() {

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();

    }

}
