//count smaller element
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
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]<=k)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}