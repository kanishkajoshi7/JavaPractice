//Sum of bit difference :https://practice.geeksforgeeks.org/problems/sum-of-bit-differences/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int diff(int n)
    {
        String s = Integer.toBinaryString(n);
        int l = s.length();
        int count=0;
        for(int x=0;x<l;x++)
        {
            if(s.charAt(x)=='1')
            {
                count++;
            }
        }
        return count;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int sum=0;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    for(int j=0;j<n-1;j++)
		    {
		        for(int k=j+1;k<n;k++)
		        {
		            sum+=diff(a[j]^a[k]);
		        }
		    }
		    System.out.println(2*sum);
		}
	}
}