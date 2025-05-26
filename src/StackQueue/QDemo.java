package StackQueue;

public class QDemo {
    public static void main(String[] args) throws Exception {
        QueueUsingLinkList q=new QueueUsingLinkList();
        q.enQ(1);
        //q.DeQ();
        q.enQ(2);
        q.enQ(3);
        q.enQ(4);
        q.enQ(5);
        System.out.println(q.deQ());
        q.enQ(6);
        q.display();

    }
}
