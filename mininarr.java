//https://practice.geeksforgeeks.org/problems/ishaan-loves-chocolates/0
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
	       int min=0;
	       for(int j=0;j<n;j++)
	       {
	           a[j]=sc.nextInt();
	       }
	       Arrays.sort(a);
	       System.out.println(a[0]);
	       
	       
	   }
	}
}