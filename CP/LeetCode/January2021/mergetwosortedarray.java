import mypack.Simple;
import java.util.*;

class Test
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*int arr1[]=Simple.inputArray();
        int arr2[]=Simple.inputArray();
        int m=arr1.length;
        int n=arr2.length;*/
      /*int arr[]= mergeTwoSortedArrays(arr1,m,arr2,n);
      Simple.printArray(arr);*/
      Simple.printMsg("Enter m and n");
      int m=sc.nextInt();
      int n=sc.nextInt();
      int arr1[]=new int[m+n];
      int arr2[]=new int[n];
      Simple.printMsg("ENter first array and second array");
      for(int i=0;i<m;i++)
      arr1[i]=sc.nextInt();
      for(int i=0;i<n;i++)
      arr2[i]=sc.nextInt();
      arr1=mergeTwoSortedArraysWithoutExtraSpace(arr1,m,arr2,n);

    }

    // Solution using O(n) extra space.
    static int[] mergeTwoSortedArrays(int a1[],int m,int a2[] ,int n)
    {
        int arr[]=new int[a1.length+a2.length];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(a1[i]<a2[j])
            {
                arr[k]=a1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=a2[j];
                j++;
                k++;
            }
        }
            while(i<m)
            {
                arr[k]=a1[i];
                i++;
                k++;
            }
        

            while(j<n)
            {
                arr[k]=a2[j];
                j++;
                k++;
            }
        
        System.out.println(i+" "+ j);
        return arr;
    }
// Solution without using Extra Space
 public static int[] mergeTwoSortedArraysWithoutExtraSpace(int arr1[],int m,int arr2[],int n)
  { 
      int l=(arr1.length-1);
      if(n!=0){
      for(int i=m-1;i>=0;i--)
      {
           arr1[l]=arr1[i];
           --l;
           arr1[i]=0;
      }
    }
      Simple.printArray(arr1);
      int i=arr1.length-m;
      System.out.println(i);
      int j=0;
      int k=0;
      while(i<arr1.length && j<n)
      {
        System.out.println(i);
          if(arr1[i]<arr2[j])
          {
              arr1[k]=arr1[i];
              i++;
              k++;
          }
          else 
          {
            {
                arr1[k]=arr2[j];
                j++;
                k++;
            }
          }
      }

      while(j<n)
      {

        arr1[k]=arr2[j];
        j++;
        k++;
      }

      Simple.printArray(arr1);
      return arr1;
  }
}