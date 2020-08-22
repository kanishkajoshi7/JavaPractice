// Inverse-Permutatio: https://practice.geeksforgeeks.org/problems/inverse-permutation/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n+1];
		    int[] b = new int[n+1];
		    for(int j=1;j<=n;j++)
		    {
		       a[j]=sc.nextInt();
		    }

		    for(int k=1;k<=n;k++)
		    {
		        int temp = a[k];
		        b[temp]=k;
		        
		    }
		    for(int j=1;j<=n;j++)
		    {
		       System.out.print(b[j]+" ");
		    }
		    System.out.println();
		    
		}
	}
}