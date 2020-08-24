//Sherlock-a-detective:https://practice.geeksforgeeks.org/problems/sherlock-a-detective/0
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
		    ArrayList<Integer> al = new ArrayList<Integer>();
		    int[] a = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        al.add(sc.nextInt());
		    }
		    for(int j=0;j<=n;j++)
		    {
		        if(al.contains(j))
		        {
		            continue;
		        }
		        else
		        {
		            System.out.print(j+" ");
		        }
		    }
		    System.out.println();
		}
	}
}