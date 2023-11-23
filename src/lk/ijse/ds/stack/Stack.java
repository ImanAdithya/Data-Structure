package lk.ijse.ds.stack;

public class Stack {

   private int [] elementData;
   private int top;//point to the of the stack(last Element)

   public Stack(final int initialCapacity){
       elementData=new int[initialCapacity];
       top=-1;
   }

   public void push(int data){
       elementData[++top]=data;
   }


    public void printStack() {
        System.out.print ("[");
        for (int i = 0; i <= top; i++) {
            System.out.print (elementData[i]+",");
        }
        System.out.print ("\b]\n");
    }


    public int pop() {
        return elementData[top--];
    }

    public boolean isEmpty() {
       return top>0;
    }

    public int peek() {
       return elementData[top];
    }

    public boolean isFull() {
       return elementData.length==top;
    }

    public int size() {
       return top+1;
    }

    public void clear(){
       top=-1;
    }
}
