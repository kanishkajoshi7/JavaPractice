//Given an array Arr[] of N integers. Write a program to find out number of pairs in array whose XOR is odd.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean odd(int n)
    {
        if(n%2==0)
        {
            return false;
        }
        else
        return true;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int[] arr  = new int[n];
		    int count=0;
		    int odd=0;
		    int even=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		        if(arr[i]%2==0)
		        {
		            even++;
		        }
		  
		    }
		    System.out.println(even*(n-even));
		    
		    
		}
	}
}