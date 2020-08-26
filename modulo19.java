//Modulo Pairs :https://practice.geeksforgeeks.org/problems/mr-modulo-and-pairs/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int x = sc.nextInt();
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++)
		    {
		        for(int k=j+1;k<n;k++)
		        {
		            if(arr[j]%arr[k]==x)
		            {
		                count++;
		            }
		            else if(arr[k]%arr[j]==x)
		            {
		                count++;
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}