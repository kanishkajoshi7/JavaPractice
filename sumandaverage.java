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
		    int sum=0;
		    double average=0.00;
		    for(int i=0;i<n;i++)
		    {
		        int x =sc.nextInt();
		        sum+=x;
		    }
		    average=(double)sum/n;
		   String strDouble = String.format("%.2f", average);
		   System.out.println(sum+" "+strDouble);
		}
	}
}