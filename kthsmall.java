//Kth smallest number:https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
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
	        for(int j=0;j<n;j++)
	        {
	            a[j]=sc.nextInt();
	        }
	        int x = sc.nextInt();
	        Arrays.sort(a);
	       
	        System.out.println(a[x-1]);
	    }
		
	}
}