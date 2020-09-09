//Given an array of n elements such that every element of array is an integer in the range 1 to n, find the sum of all the distinct elements of the array.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int sum=0;
		    HashSet<Integer> h = new HashSet<Integer>(); 
		    for(int i=0;i<n;i++)
		    {
		        int a=sc.nextInt();
		        
		        if(!h.contains(a))
		        {
		            h.add(a);
		            sum+=a;
		        }
		        
		    }
		    System.out.println(sum);
		        
		    
  
		}
	}
}