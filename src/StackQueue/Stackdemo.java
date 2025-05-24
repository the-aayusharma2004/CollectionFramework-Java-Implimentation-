package StackQueue;

public class Stackdemo
{
    public static void main(String[] args) throws Exception {
        StackUsingLinkList st =new StackUsingLinkList();
        //System.out.println(st.isFull());
        //System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
//        for(int i=0;i<st.top+1;i++)
//        {
//            System.out.println(st.StackArray[i]);
//        }
        System.out.println(st.stackll);
        st.pop();
        System.out.println("after pop");
//        for(int i=0;i<st.top+1;i++)
//        {
//            System.out.println(st.StackArray[i]);
//        }
        System.out.println(st.stackll);
    }
}
