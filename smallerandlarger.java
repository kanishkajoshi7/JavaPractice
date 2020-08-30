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
		    int x= sc.nextInt();
		    int[] a = new int[n];
		    int l=0;
		    int g=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]<=x)
		        {
		            l++;
		        }
		         if(a[i]>=x)
		        {
		            g++;
		        }
		    }
		    System.out.println(l+" "+g);
		}
	}
}