// Distinct absolute array elements :https://practice.geeksforgeeks.org/problems/distinct-absolute-array-elements/0
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
		    ArrayList<Integer> al = new ArrayList<Integer>();
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		        
		    }
		    for(int j=0;j<n;j++)
		    {
		        if(al.contains(Math.abs(a[j])))
		        {
		            continue;
		        }
		        else
		        {
		            al.add(Math.abs(a[j]));
		        }
		    }
		    System.out.println(al.size());
		    
		}
	}
}