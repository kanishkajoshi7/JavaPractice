//https://practice.geeksforgeeks.org/problems/game-with-nos/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(i==n-1)
		        {
		            b[i]=a[i];
		        }
		        else
		        {
		            b[i]=a[i] ^ a[i+1];
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(b[i]+" ");
		    }
		    System.out.println();
		}
	}
}