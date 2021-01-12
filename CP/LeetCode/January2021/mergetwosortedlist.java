/*
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res1=new ListNode();
        ListNode res=null;
        while(l1!=null && l2!=null)
        {
             if(l1.val<l2.val)
             {
                 res1.next=new ListNode(l1.val,null);
                 if(res==null)
                     res=res1.next;
                 l1=l1.next;
                 res1=res1.next;
              }
            else
            {
                 res1.next=new ListNode(l2.val,null);
                   if(res==null)
                     res=res1.next;
                 l2=l2.next;
                 res1=res1.next;
            }
        }
        
        while(l1!=null)
        {
                 res1.next=new ListNode(l1.val,null);
                 if(res==null)
                     res=res1.next;
                 l1=l1.next;
                 res1=res1.next;
        }
        while(l2!=null)
        {
                 res1.next=new ListNode(l2.val,null);
                   if(res==null)
                      res=res1.next;
                 l2=l2.next;
                 res1=res1.next;
        }

        return res;
    }
}

*/


import java.utli.*;
class TreeNode
{
    TreeNode next;
    int val=0;
}

class Test
{
    public static void main(String[] args) {
        
    }
}