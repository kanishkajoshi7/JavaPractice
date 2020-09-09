//You are given an array A of size N. Replace every element with the next greatest element (greatest element on its right side) in the array. Also, since there is no element next to the last element, replace it with -1.
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
		    StringBuilder sb = new StringBuilder();
		    int[] a= new int[n];
		    Stack<Integer> s = new Stack<Integer>();
		    s.push(-1);
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=n-1;i>0;i--)
		    {
		        
		        s.push(Math.max(s.peek(),a[i]));
		       
		    }
		    while(!s.isEmpty())
		    {
		        System.out.print(s.pop()+" ");
		    }
		    System.out.println();
		}
	}
}