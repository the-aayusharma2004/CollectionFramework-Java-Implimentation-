package LinkList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkList l=new LinkList();
        l.addFirst(6);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        //l.add(6);
        l.display();
        System.out.println();
        System.out.println("after insertion in between ");
        l.add(5,0);
        l.display();
        l.getSize();
        System.out.println(l.getAt(3));
    }
}
