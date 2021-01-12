import mypack.Simple;
import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Simple.inputArray();
        Simple.printArray(arr);
        int firstmax=findMax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==firstmax)
            arr[i]=-1;
        }
        Simple.printArray(arr);
        int secondmax=findMax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==secondmax)
            arr[i]=-1;
        }
        int thirdmax=findMax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==thirdmax)
            arr[i]=-1;
        } 
        Simple.printArray(arr);
        System.out.println("Fisrt max="+firstmax);
        System.out.println("secon max="+secondmax);
        System.out.println("third max="+thirdmax);
        int fourthMax=Math.min(firstmax,secondmax);
        fourthMax=Math.min(fourthMax,thirdmax);
        System.out.println(fourthMax);
      
        
    }

    static int findMax(int arr[])
    {
        int max=0;
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]>max);
            max=arr[i];
         }
         return max;
    }
}