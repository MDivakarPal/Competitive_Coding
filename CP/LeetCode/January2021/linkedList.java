package linkedlist;
import java.util.*;
public class linkedList
{

}

class SinglyLinkdeList
{
    int val;
    SinglyLinkdeList next;
    SinglyLinkdeList(int val)
    {
        this.val=val;
    }

    SinglyLinkdeList()
    {
        this.val=0;
        this.next=null;
    }
    SinglyLinkdeList(int val , SinglyLinkdeList next)
    {
        this.val=val;
        this.next=next;
    }
    SinglyLinkdeList insertList1(int val, SinglyLinkdeList head)
    {
       if(head==null)
       return (head=new SinglyLinkdeList(val));
       head.next=new SinglyLinkdeList(val,null);
    }

    SinglyLinkdeList insertList(int val)
    {
     SinglyLinkdeList list=null;
     list=list.insertList1()
     for(int i=0;i<val;i++)
     {

     }   
    }
}
