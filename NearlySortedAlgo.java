//Given an array of n elements, where each element is at most k away from its target position. The task is to print array in sorted form.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void qu(int[] arr,int n , int k)
    {
     PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		    StringBuilder sb = new StringBuilder();
		    for(int i=0;i<n;i++)
		    {
		        p.add(arr[i]);
		    
		    if(p.size()>k)
		    {
		        sb.append(p.poll()+" ");
		   }
		    }
		    
		    while(!p.isEmpty())
		    {
		        sb.append(p.poll()+" ");
		    }
		    System.out.println(sb);
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int k= sc.nextInt();
		    int[] arr = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    qu(arr,n,k);
		}
	}
}