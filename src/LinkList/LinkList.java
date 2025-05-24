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
    public int getSize()
    {
        return size ;
    }
    public int getFirst() throws Exception
    {
        if(size==0)
        {
            throw new Exception("Linked list is empty");
        }
        return head.data;
    }
    public int getAt(int index)
    {
        Node curr ;
        curr =head;
        for (int i=0;i<=index;i++)
        {
            curr=curr.next;
        }
        return curr.data;
    }
    public void removeFirst() //throws Exception
    {
        if(size==0)
        {
            //throw new Exception("Link list is empty ");
            System.out.println("link list is empty ");
        }
        else
            head =head.next;

    }
    public void removeAt(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (index == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        int i = 0;

        // Traverse to the node before the one to delete
        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        curr.next = curr.next.next;
        size--;
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
                System.out.print((Object) null+"\n");
            }
        }
    }
}
