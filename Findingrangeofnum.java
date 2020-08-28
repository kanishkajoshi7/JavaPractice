// Find  starting and ending index of a number
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
		    int[] a = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    int x = sc.nextInt();
		    int start=0;
		    int end=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==x)
		        {
		            System.out.print(i+" ");
		            break;
		        }
		    }
		    for(int j=n-1;j>=0;j--)
		    {
		        if(a[j]==x)
		        {
		            System.out.print(j);
		            break;
		        }
		    }
		    System.out.println("");
		}
	}
}