package StackQueue;

public class QueueUsingArray
{
    int QArray[];
    int front;
    int rear;
    int size ;
    int cap =10;
    QueueUsingArray()
    {
        QArray=new int[cap];
    }
    QueueUsingArray(int cap)
    {
        this.size =0;
        this.cap=cap;
        this.front=-1;
        this.rear=-1;
        this.QArray=new int [cap];
    }
    public boolean isFull()
    {
        return size==cap;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void enQ(int data) throws Exception
    {
        if(isFull()) {
            throw new Exception("Queue is Full");
        }
        else if(rear==-1 &&front==-1)
        {
           front=rear=0;

        }
        else
        {
            rear=(rear+1)%cap;
        }
        QArray[rear]=data;
        size++;
    }
    public int DeQ() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty!");
            //return -1;
        }
        int data;
        data= QArray[front];
        front=(front+1)%cap;
        size--;
        if(size==0)
        {
            front =rear=-1;
        }
        return data;
    }
    public void display()
    {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % cap;
            System.out.print(QArray[index] + "->");
        }
        System.out.println();
    }
}
