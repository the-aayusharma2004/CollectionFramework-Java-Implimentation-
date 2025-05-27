package BinaryTree;

public class BTtest {
    public static void main(String[] args) {
        BinaryTree t=new BinaryTree();
        System.out.println("inorder");
        t.inOrder(t.root);
        System.out.println("pre Order");
        t.preOrder(t.root);
        System.out.println("post order");
        t.postOrder(t.root);
    }
}
