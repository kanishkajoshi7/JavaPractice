//Check sorted array
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   for(int i=0;i<t;i++)
	   {
	       int n  = sc.nextInt();
	       int[] a = new int[n];
	       int flag=0;
	       for(int j=0;j<n;j++)
	       {
	           a[j]=sc.nextInt();
	       }
	       for(int j=0;j<n-1;j++)
	       {
	           if(a[j]>a[j+1])
	           {
	               flag=1;
	               break;
	           }
	       }
	       if(flag==1)
	       {
	           System.out.println(0);
	       }
	       else
	       {
	           System.out.println(1);
	       }
	   }
	}
}