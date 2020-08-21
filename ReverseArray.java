import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   for(int i=0;i<t;i++)
	   {
	       int n =sc.nextInt();
	       int[] a = new int[n];
	       for(int j=0;j<n;j++)
	       {
	           a[j]=sc.nextInt();
	       }
	       for(int j=n-1;j>=0;j--)
	       {
	           System.out.print(a[j]+" ");
	       }
	       System.out.println();
	       
	   }
	}
}