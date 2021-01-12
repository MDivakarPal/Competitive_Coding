import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int k=sc.nextInt();
          int d=sc.nextInt();
          int p=0;
          for(int i=0;i<n;i++)
          p=p+sc.nextInt();

           int totald=p/k;
           if(totald>d)
           totald=d;
           System.out.println(totald);
    }
}