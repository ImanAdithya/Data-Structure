package lk.ijse.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList ();

        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);

       // ll.insertAtEnding (40);

        //ll.traverse ();

       // ll.deleteAtEnding ();

        //ll.traverse ();
       // ll.traverse ();

        System.out.println (ll.get (2));
    }
}
