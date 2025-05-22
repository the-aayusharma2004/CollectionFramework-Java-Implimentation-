package ArraysArrayList;

public class Book {
    String name ;
    int isbn ;
    int price ;
    Book(String name, int isbn , int price )
    {
        this.name=name;
        this.isbn=isbn;
        this.price=price;
    }
    @Override
    public String toString()
    {
        return "isbn"+isbn+" name "+name +"price" +price;
    }
}
