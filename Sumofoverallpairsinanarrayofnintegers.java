//Given an array A of n integers, find the sum of f(a[i], a[j]) of all pairs (i, j) such that (1 <= i < j <= n).
f(a[i], a[j]):       If | a[j]-a[i] | > 1

                         f(a[i], a[j]) = a[j] - a[i]

                         Else  if | a[j]-a[i] | <= 1

                         f(a[i], a[j]) = 0
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
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		           if(Math.abs(a[j]-a[i]) >1)
		           {
		               sum+=(a[j]-a[i]);
		           }
		           else
		           {
		               sum=sum+0;
		           }
		        }
		    }
		    System.out.println(sum);
		}
	}
}