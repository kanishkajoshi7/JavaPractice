//FindUniqueElement:https://practice.geeksforgeeks.org/problems/find-unique-element/0
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
		    int k = sc.nextInt();
		    int[] a = new int[n];
		    int[] f = new int[10001];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		        
		    }
		    for(int j=0;j<n;j++)
		    {
		        f[a[j]]++;
		        
		    }
		    for(int j=0;j<10001;j++)
		    {
		        if(f[j]==1)
		        {
		            System.out.println(j);
		            
		        }
		    }
		}
	}
}