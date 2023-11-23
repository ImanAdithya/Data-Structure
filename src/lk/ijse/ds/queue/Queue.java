package lk.ijse.ds.queue;

public class Queue {
    private int [] elementData;
    private int front;
    private int rear;


    public Queue(final int initialCapacity){
        elementData=new int[initialCapacity];
        front=-1;
        rear=-1;
    }

    public void enqueue(int data) {

        if (isFull ()){
            grow();
        }

        if (front==-1){
            front=0;
        }
        elementData[++rear]=data;
    }

    private void grow() {
    }

    public void printQueue() {
        System.out.print ("[");

        for (int i = front; i <=rear ; i++) {
            System.out.print (elementData[i]+",");
        }
        System.out.print ("\b]");

    }

    public void deQueue() {
        front++;
    }

    public int peek() {
        return front;
    }

    public boolean isFull(){
        return rear==elementData.length-1 || front>rear;
    }
}
