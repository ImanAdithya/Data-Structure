package lk.ijse.ds.stack;

public class Stack {

   private int [] elementData;
   private int top;//point to the of the stack(last Element)

   public Stack(final int initialCapacity){
       elementData=new int[initialCapacity];
       top=-1;
   }

   public void push(int data){
       if (isFull ()){
           throw new RuntimeException ("Stack is full..");
       }
       elementData[++top]=data;
   }


    public void printStack() {
        System.out.print ("[");
        for (int i = 0; i <= top; i++) {
            System.out.print (elementData[i]+",");
        }
        System.out.print (isEmpty ()?"Empty Stack]":"\b]\n");
    }


    public int pop() {
       if (isEmpty ()){
           System.err.println ("Stack is Empty");
       }

        return elementData[top--];
    }

    public boolean isEmpty() {
       return top>0;
    }

    public int peek() {
       return elementData[top];
    }

    public boolean isFull() {
       return elementData.length-1==top;
    }

    public int size() {
       return top+1;
    }

    public void clear(){
       top=-1;
    }

    public void grow(){
       int [] temp=elementData;

       elementData=new int[elementData.length * 2];

        for (int i = 0; i < temp.length; i++) {
            elementData[i]=temp[i];
        }
    }
}
