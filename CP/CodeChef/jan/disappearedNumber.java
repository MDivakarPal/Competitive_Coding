import mypack.Simple;
import java.util.*;
class Test
{
    public static void main(String[] args) {
        int arr[]=Simple.inputArray();
        for(int i:findDisappear(arr))
        System.out.println(i+" ");
    }

    static List<Integer> findDisappear(int arr[])
    {
        List <Integer> list=new ArrayList<>();
        int last=findMinimum(arr);
        int start=last+arr.length-1;
        while(last<=start)
        {
            list.add(last);
            last++;
        }
        for(int i=0;i<arr.length;i++)
            list.remove(new Integer(arr[i]));
        System.out.println(list);
        return list;
    }

    static int findMinimum(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        return min;

    }
}