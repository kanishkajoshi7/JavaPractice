// XOR pairs :https://practice.geeksforgeeks.org/problems/counts-zeros-xor-pairs/0
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
		    int n=sc.nextInt();
		    int[] a = new int[n];
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		       a[j]=sc.nextInt();  
		    }
		    for(int j=0;j<n-1;j++)
		    {
		        for(int k=j+1;k<n;k++)
		        {
		            int x =a[j]^a[k];
		            if(x==0)
		            {
		                count++;
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}