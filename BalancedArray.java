//Given an array of even size, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.

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
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int sum1=0;
		    int sum2=0;
		    int mid=n/2;
		    for(int i=0;i<n;i++)
		    { 
		        arr[i]=sc.nextInt();
		        if(i<mid)
		        {
		            sum1+=arr[i];
		        }
		        else
		        {
		            sum2+=arr[i];
		        }
		    }
		    System.out.println(Math.abs(sum2-sum1));
		}
	}
}