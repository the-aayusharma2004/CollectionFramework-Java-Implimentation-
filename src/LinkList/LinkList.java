package LinkList;

import static java.lang.System.exit;

public class LinkList
{
     Node head ;
     Node tail;
     int size;
    LinkList()
    {
        head=tail=null;
        size=0;
    }
    //adds to the end of the current ll
    public void add(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    //Adds at a specific position of the linked list
    public void add(int data,int index)
    {
        Node newNode =new Node(data);
        Node curr =head ;
        int i=0;
        if(index==0)
        {
            addFirst(data);
            return;
        }
        while(curr!=null && i<index-1)
        {
            curr=curr.next;
            i++;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        curr=newNode;
    }
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next =head;
        head =newNode;
        if(head.next ==null)
        {
            tail =newNode;
        }
        size++;
    }
    public void display()
    {
        Node temp =head;

        while (temp!=null)
        {
            System.out.print(temp.data +"->");
            temp=temp.next;
            if(temp==null)
            {
                System.out.print((Object) null);
            }
        }
    }
}
