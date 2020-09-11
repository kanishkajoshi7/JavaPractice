//You are given an array A[] , you have to construct a new array A2[].
The values in A2[] are obtained by doing OR of consecutive elements in array.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] arr = new int[n];
		    int[] a = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(i==n-1)
		        {
		            a[i]=arr[i]|0;
		        }
		        else
		        {
		          a[i]=arr[i]|arr[i+1];
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(a[i]+" ");
		    }
		    System.out.println(" ");
		    
		}
	}
}