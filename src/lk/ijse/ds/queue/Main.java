package lk.ijse.ds.queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue (5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        queue.deQueue();

        queue.printQueue();

        queue.peek();

    }
}
