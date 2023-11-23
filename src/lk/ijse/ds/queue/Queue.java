package lk.ijse.ds.queue;

public class Queue {
    private int[] elementData;
    private int front;
    private int rear;


    public Queue(final int initialCapacity) {
        elementData = new int[initialCapacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {

        if (isFull ()) {
            grow ();
        }

        if (front == -1) {
            front = 0;
        }
        elementData[++rear] = data;
    }

    private void grow() {
        int[] temp = elementData;
        elementData = new int[temp.length * 2];

        System.arraycopy (temp, 0, elementData, 0, temp.length);
    }

    public void printQueue() {
        System.out.print ("[");

        for (int i = front; i <= rear; i++) {
            System.out.print (elementData[i] + ",");
        }
        System.out.print (isEmpty () ? "Empty Queue]" : "\b]");

    }

    public void deQueue() {
        front++;
    }

    public int peek() {

        if (isEmpty ()) {
            System.err.println ("Queue is Empty");
            return -1;
        }

        return front;
    }

    public boolean isFull() {
        return rear == elementData.length - 1 || front > rear;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void clear() {
        front = -1;
        rear = -1;
    }

    public int size(){
        return rear-front+1;
    }
}
