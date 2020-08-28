//min and  max
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int min=0;
		    int max=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		     min=a[0];
		    max=a[0];
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]>max)
		        {
		            max=a[j];
		        }
		        else if(a[j]<min)
		        {
		            min=a[j];
		        }
		    }
		    System.out.println(max + " "+min);
		    
		}
	}
}