//https://practice.geeksforgeeks.org/problems/compete-the-skills/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    
		    int[] a = new int[3];
		    int[] b = new int[3];
		    int c =0;
		    int d=0;
		    for(int j=0;j<3;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    for(int j=0;j<3;j++)
		    {
		        b[j]=sc.nextInt();
		    }
		    for(int j=0;j<3;j++)
		    {
		        if(a[j]>b[j])
		        {
		            c++;
		        }
		        else if(b[j]>a[j])
		        {
		            d++;
		        }
		    }
		    System.out.println(c+" "+d);
		    
		}
	}
}