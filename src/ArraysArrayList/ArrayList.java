package ArraysArrayList;

public class ArrayList<T> {
    Object arr[];
    int s;
    int cap;

    ArrayList() {
        cap = 10;
        s = 0;
        arr = new Object[cap];
    }
    ArrayList(int c)
    {
        cap=c;
        s=0;
        arr=new Object[cap];
    }

    void add(T item) {
        if(s==cap)
        {
            Object narr[] =new Object[2*cap];
            for(int i =0;i<arr.length;i++)
            {
                narr[i]=arr[i];

            }
            arr =narr;
        }
        arr[s++] = item;//Increase the size by 1 and put the item in the array
    }

    T get(int index) {
        try {
            return ((T)arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:something went wrong ");
        }
        return null;
    }

    int size()
    {
        return s;
    }
    boolean isEmpty()
    {
        if(s==0)
            return true;
        else //if(s!=0)
        {
            return false;
        }
    }
    int currCap()
    {
        return cap;
    }
    public void remove(int index)
    {
        if(index >s || index<0 )
        {
            throw new IndexOutOfBoundsException();
        }
        T removeElement =(T) arr[index];
        for(int i=index;i< s-1;i++)
            arr[i] = arr[i + 1];
        arr[--s]=null;
        //return removeElement;
    }
    void print()
    {
        for(int i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
    }
}