package StackQueue;

public class QDemo {
    public static void main(String[] args) throws Exception {
        QueueUsingArray q=new QueueUsingArray(5);
        q.enQ(1);
        //q.DeQ();
        q.enQ(2);
        q.enQ(3);
        q.enQ(4);
        q.enQ(5);
        q.DeQ();
        q.enQ(6);
        q.display();

    }
}
