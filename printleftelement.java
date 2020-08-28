//Print left element:https://practice.geeksforgeeks.org/problems/print-the-left-element/0
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
		    int[] a = new int[n];
		    int max=0;
		    int min=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j] = sc.nextInt();
		    }
		    Arrays.sort(a);
		    if(n==1)
		    {
		        System.out.println(a[0]);
		    }
		     else if(n%2==0)
		    {
		        System.out.println(a[n/2 -1]);
		    }
		    else
		    {
		     System.out.println(a[n/2]);   
		    }
		}
	}
}