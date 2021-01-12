/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static  String strencode="abcdefghijklmnop";

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0){
		int n=Integer.parseInt(sc.nextLine());
        String str=sc.nextLine();
        int i=0;
        String res="";
        try{
        while(i<=n-4)
        {
           // System.out.println(i);
            res+=strencode.charAt(Integer.parseInt(str.substring(i,(i+4)),2));
            i=i+4;
        }
    }
        catch(Exception e){
            System.out.println("I ="+i);
            System.out.println(res);
        }
        System.out.println(res);
		}
	}
	
	
}
