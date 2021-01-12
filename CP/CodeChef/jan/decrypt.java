import java.util.*;

class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter encoded string");
        String s=sc.next();
        int i=0;
        //char ns=new char[s.length()];
        int a=s.charAt(i);
        char sc1[]=new char[s.length()];
        int p1=0,p2=s.length()-1;
        while (p1<p2)
        {
          int n=s.charAt(p1);
          if((s.charAt(p1)=='1')||(s.charAt(p1)=='2')||(s.charAt(p1)=='3')||(s.charAt(p1)=='4')||(s.charAt(p1)=='5')||(s.charAt(p1)=='6')||(s.charAt(p1)=='7')||(s.charAt(p1)=='8')||(s.charAt(p1)=='9') )
          {
              if(s.charAt(p2)=='0'){
              sc1=addChar(sc1,s.charAt(p1),p2);
              p1++;
              p2--;
              }
            if(s.charAt(p2)=='*')
          {
            sc1=addChar(sc1,s,p2);
            p2-=-2;

          }
          if(s.charAt(p2)!='0')
           { 
              p2--;

           }
              continue;
              
          }
          {
          if(s.charAt(p1)=='*')
          {
              sc1=addChar(sc1,s,p1);
              p1+=2;

          }

          if(s.charAt(p2)=='*')
          {
            sc1=addChar(sc1,s,p2);
            p2-=-2;

          }
          if(s.charAt(p2)!='0')
           { 
              p2--;

           }
          }
         
        }
        
        for(char c11:sc1)
        System.out.print(c11);
    }

    static char[] addChar(char [] sc1, char s, int i)
    {
        sc1[i]=s;
        return sc1;
    }

    static char[] addChar(char [] sc1, String s, int i)
    {
        sc1[i-1]=s.charAt(i-2);
        sc1[i-2]=s.charAt(i-1);
        return sc1;
    }
}