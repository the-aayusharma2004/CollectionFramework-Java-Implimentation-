package LinkList;

public class LinkListDemo {
    public static void main(String[] args) throws Exception {
        LinkList l=new LinkList();
        l.addFirst(6);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.display();
        System.out.println(l.getIndex(1));
        l.removeAt(3);
        l.display();
    }
}
