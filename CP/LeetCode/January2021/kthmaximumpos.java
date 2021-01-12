import mypack.*;
import java.util.*;
class Test
{
    static int a1[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=Simple.inputArray();
        System.out.println("Enter k");
        System.out.println(findKthPositive(a, sc.nextInt()));
         Simple.printArray(a1);
    }
    static int findKthPositive(int[] arr, int k) {
       // addMissing(1,arr[0]);
      a1=new int[k];
      System.out.println(a1.length);
      int j=addMissing(0,arr[0],1,true);
      Simple.printArray(arr);
      System.out.println();
        for(int i=1;i<arr.length;i++)
        {     
               
               j=addMissing(j,arr[i],arr[i-1],false);
               System.out.println("i="+j+" ,j="+arr[i-1]+", k="+arr[i]);
        }

        System.out.println("I ="+j);
            int lm=arr[arr.length-1]+(k-j)+1;
            addMissing(j,lm,arr[arr.length-1],false);
        System.out.println("Max is"+a1[k-1]);
             return 0;
    }
    
    static int addMissing(int i,int j,int k,boolean st)
    {
       // System.out.println("i= "+i+" j= "+j+"k="+k);
        while(i<a1.length)
        {
            if(k<j ){
          //  System.out.println(k+" j= "+j);
           if(k==1 && st)
           { 
            a1[i]=k;
            i++;
            //System.out.println(a1[i])
           }
           k++;
           if(k<j){
           a1[i]=k;
           i++;}

         }
        else 
        break;
        }
      return i;
    }
}