//length of longest subarray :https://practice.geeksforgeeks.org/problems/length-of-longest-subarray/0
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
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int max1=0;
		    int max2=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++)
		    {
               if(a[j]>=0)
               {
                   max1++;
               }
               else
               {
                   max2=Math.max(max2,max1);
                   max1=0;
               }
		    }
		    System.out.println(Math.max(max2,max1));
		    
		    
		}
	}
}