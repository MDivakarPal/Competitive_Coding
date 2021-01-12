import java.util.*;
class Test
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            int suma=0,sumb=0;
            for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            suma+=a[i];
            }
            for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
           sumb+=b[i];
           }
            Arrays.sort(a);
            Arrays.sort(b);
            int res=0;
            int j=m-1,i=0;
             while(i<n && j>=0)
             {
                 if(suma>sumb)
                     break;
                suma=suma-a[i]+b[j];
                sumb=sumb-b[j]+a[i];
                j--;
                i++;
                res++;
             }
             System.out.println("Sum a ="+suma);
             System.out.println("Sum b ="+sumb);
             if(suma>sumb)
             System.out.println("Res ="+res);
             else
             System.out.println("-1");
        }
    }
}