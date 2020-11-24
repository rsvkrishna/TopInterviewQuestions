package com.medium;

public class AddTwoNumbers {
    public static void main (String args[]){
        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        ListNode l3=new ListNode();
        ListNode l4=new ListNode();
        ListNode l5=new ListNode();
        ListNode l6=new ListNode();
        l1.val=2; l2.val=4; l3.val=8;l4.val=5; l5.val=6; l6.val=4;

        l1.next=l2; l2.next=l3; l3.next=null;

        l4.next=l5; l5.next=l6; l6.next=null;

        printList(l1,l4);

    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){

        ListNode newHead=new ListNode(0);
        ListNode l3=newHead;





        return newHead.next;
    }

    public static void printList(ListNode l1,ListNode l2){
        while(l1!=null){
            System.out.print(l1.val);
            l1=l1.next;
        }
        System.out.println("");
        while(l2!=null){
            System.out.print(l2.val);
            l2=l2.next;
        }
    }
}

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
