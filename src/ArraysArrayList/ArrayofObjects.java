package ArraysArrayList;

import java.util.Arrays;

public class ArrayofObjects {
    public static void main(String[] args) {
        //Book b =new Book("Java",1,200);
        //System.out.println(b);
        Book books[] =new Book[3];
        books[0]=new Book("Java",1,100);
        books[1]=new Book("c",2,120);
        books[2]=new Book("html",3,250);
        //System.out.println(Arrays.toString(books));
        Arrays.sort(books,(p1,p2)->(p1.price-p2.price));
        System.out.println(Arrays.toString(books));
    }
}
