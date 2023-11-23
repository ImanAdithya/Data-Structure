package lk.ijse.ds.linkedlist;

public class LinkedList {

    private Node head;
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public void insertAtBeginning(int data) {
        Node node = new Node (data);

        node.next=head;
        head=node;
    }

    public void insertAtEnding(int data) {

        if (head==null){
            insertAtBeginning (data);
            return;
        }

        Node node = new Node(data);

       Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;

    }

    public void traverse(){
        System.out.print ("[");

        Node temp=head;

        while (temp!=null){
            System.out.print (temp.data +",");
            temp=temp.next;
        }

        System.out.print ("\b]");
    }

     public void  insertAtPosition(int data ,int position){

         Node node = new Node (55);

         Node temp=head;

         for (int i = 0; i < position-1; i++) {
             temp=temp.next;
         }

         node.next=temp.next;
         temp.next=node;

     }

     public void deleteAtBeginning(){

        if (head==null){
            System.out.println ("list is Empty");
            return;
        }

         head=head.next;
     }

     public void deleteAtEnding(){

        Node temp=head;
         while (temp.next.next!=null){
             temp=temp.next;
         }

         temp.next=null;
     }

     public void deleteAtPosition(int index){
        Node temp=head;

         for (int i = 0; i < index-1; i++) {
             temp=temp.next;
         }

         temp.next=temp.next.next;


     }
}
