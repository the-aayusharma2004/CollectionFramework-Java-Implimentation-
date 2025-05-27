package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Node root;
    BinaryTree()
    {
        Scanner sc = new Scanner(System.in);
        root=createTree(sc);
    }
    Node createTree(Scanner sc)
    {
        int data =sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        Node n =new Node(data);
        n.left=createTree(sc);
        n.right=createTree(sc);
        return n ;
    }
    public void preOrder(Node node)
    {
        if(node!=null)
        {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
        else
            return;
    }
    public void postOrder(Node node)
    {
        if(node!=null)
        {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data+" ");
        }
        else return ;
    }
    public void inOrder(Node node)
    {
        if(node!=null)
        {
            inOrder(node.left);
            System.out.println(node.data+" ");
            inOrder(node.right);
        }
        else
            return ;
    }
//    void levelOrderTraversal(Node node)
//    {
//        Queue<Node>q =new LinkedList<>();
//        q.offer(node);
//        while(!q.isEmpty())
//        {
//            Node f =q.poll();
//        }
//    }
}
