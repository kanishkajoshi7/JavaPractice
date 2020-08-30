//Value equal to index value
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
		    boolean f = false;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]==j+1)
		        {
		            f=true;
		            System.out.print(a[j]+" ");
		        }
		    }
		    if(!f)
		    {
		        System.out.print("Not Found");
		    }
		    System.out.println();
		    
		}
	 }
}