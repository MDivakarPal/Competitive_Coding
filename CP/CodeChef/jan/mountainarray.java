import mypack.*;
import java.util.*;
class Test
{
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int arr[]=Simple.inputArray();
       if( mountBlue(arr))
       System.out.println("I am mount ");
       else
       System.out.println("I am not mount");
    }

    static boolean mountBlue(int a[])
    { 
     int i=maxIndex(a);
     System.out.println(a[i]+" index="+i);
     if(i==0)
     return false;
     for(int j=0;j<i;j++)
     {
        if(a[j]>=a[j+1])
         return false;
     }
     for(int j=i+1;j<a.length-1;j++)
     {
        if(a[j]<=a[j+1])
         return false;
     }
     return true;
    }

    static int maxIndex(int a[])
    {
       int max=0;
       for(int i=1;i<a.length;i++)
       {
           if(a[i]>a[max])
           max=i;
       }

       return max;
    }
}