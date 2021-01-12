import mypack.Simple;
import java.util.*;
class Test
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Simple.printMsg("Enter the size of first array");
        int ar[]=new int[sc.nextInt()];
        Simple.printMsg("Enter size piece array");
        int arr[][]=new int[sc.nextInt()][];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            Simple.printMsg("Enter size of "+(i+1)+" Piece array");
            arr[i]=new int[sc.nextInt()];
            System.out.println("Enter your array");
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            Simple.printArray(arr[i]);
        }
        concatArray(arr);
    }

    static void concatArray(int arr[][])
    {
       ArrayList <ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(i);
           for(int j=0;j<arr[i].length;j++)
           {
               for(int k=0;k<arr[i].length;k++)
               {
                  System.out.print(arr[j][k]+", ");
               }

               System.out.println();
            }
       }

       System.out.println(list);
    }
}