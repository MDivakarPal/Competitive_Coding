import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int add=4,res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(res+" ");
                res=res+add;
            }
        }
    }
}