//swap kth element
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] a = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    int temp=a[k-1];
		    a[k-1]=a[n-k];
		    a[n-k]=temp;
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(a[j]+" ");
		    }
		    System.out.println("");
		}
	}
}