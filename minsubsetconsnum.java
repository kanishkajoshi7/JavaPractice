//min subsets with consecutive numbers:https://practice.geeksforgeeks.org/problems/min-subsets-with-consecutive-numbers/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n= sc.nextInt();
		    int[] a=new int[n];
		    int x=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    for(int j=0;j<n-1;j++)
		    {
		       
		        if(a[j]+1==a[j+1])
		        {
		            continue;
		        }
		      
		        x++;
		    }
		    System.out.println(x+1);
		}
	}
}