package StackQueue;
import java.util.LinkedList;
public class QueueUsingLinkList {
    LinkedList<Integer> Qll;
    QueueUsingLinkList()
    {
        Qll =new LinkedList<>();
    }

    public boolean isEmpty()
    {
        return Qll.isEmpty();
    }
    public void enQ(int data)
    {
        Qll.addLast(data);
    }
    public int deQ() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Empty Queue");
        }
        return Qll.removeFirst();
    }
    public void display() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Empty Queue");
        }
        else
            System.out.println(Qll);
    }
}
