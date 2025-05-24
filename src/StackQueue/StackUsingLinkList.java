package StackQueue;

import java.util.LinkedList;


public class StackUsingLinkList
{
    LinkedList<Integer>stackll ;
    StackUsingLinkList()
    {
        stackll =new LinkedList<>();
    }
    public void push(int data)
    {
        stackll.addLast(data);
    }
    public int pop() throws Exception
    {
        if(stackll.isEmpty())
        {
            throw new Exception("Stack is Empty!");
        }
        else {
            stackll.getLast();

            return stackll.removeLast();
        }
    }
    public int peek() throws Exception
    {
        if(stackll.isEmpty())
        {
            throw new Exception("Stack is Empty!");
        }
        else {
            stackll.getLast();

            return stackll.removeLast();
        }
    }
}
