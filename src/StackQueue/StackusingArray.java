package StackQueue;

public class StackusingArray
{
    int StackArray[];
    int size ;
    int top ;
    static final int maxSize =10;
    StackusingArray()
    {
        this.size=maxSize;
        this.top=-1;
        this.StackArray=new int[this.size];
    }
    StackusingArray(int size )
    {
        this.size =size ;
        this.StackArray=new int [this.size];
        top=-1;
    }
    public boolean isFull()
    {
        if(top==size-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true ;
        else
            return false ;
    }
    public void push(int data){ //throws Exception {
        if(isFull())
        {
            int narr[] =StackArray;
            StackArray=new int[2*maxSize];
            for(int i=0;i< narr.length;i++)
            {
                StackArray[i]=narr[i];
            }
        }
        else
            StackArray[++top]=data ;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Empty Stack");
        }
        else
            return StackArray[top--];
    }
    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Empty Stack");
        else
            return StackArray[top];
    }

}
