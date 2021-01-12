import mypack.Simple;
class Test
{
    public static void main(String[] args) {
        int a[]=Simple.inputArray();
        int i=0,l=a.length;
          System.out.println(l);
         // Simple.printArray(a);
        while(i<(l-1))
        {
           // System.out.println("i");
            if(a[i]==a[i+1])
            {
                for(int j=i+1;j<(l-1);j++)
                {a[j]=a[j+1];}
                l--;
            }

            if(a[i]!=a[i+1])
            i++;
        }
       // System.out.println(l);
        for(int j=0;j<l;j++)
        System.out.print(a[j]+" ");
    }
}