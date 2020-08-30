//Given an array with n distinct elements, convert the given array to a reduced form where all elements are in range from 0 to n-1. The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element, … n-1 is placed for largest element.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];
		    StringBuilder sb = new StringBuilder();
		    for(int j=0;j<n;j++)
		    {
		       a[j]=sc.nextInt();
		       b[j] = a[j];
		    }
		    Arrays.sort(b);
		    for(int j=0;j<n;j++)
		    {
		        for(int k =0;k<n;k++)
		        {
		            if(a[j]==b[k])
		            {
		                sb.append(k+" ");
		            }
		        }
		    }
		    System.out.println(sb);
		    
		}
	}
}