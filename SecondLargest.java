//Second Largest element
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n =sc.nextInt();
		    int[] a = new int[n];
		    int m1=0;
		    int m2=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    m1=a[0];
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]>m1)
		        {
		            m2=m1;
		            m1=a[j];
		        }
		        else if(a[j]>m2 && a[j]!=m1)
		        {
		            m2=a[j];
		        }
		    }
		    System.out.println(m2);
		}
	}
}