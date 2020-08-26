import java.util.*;
import java.lang.*;
import java.io.*;

//Max value after m range of operation :https://practice.geeksforgeeks.org/problems/max-value-after-m-range-operation/0
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int k= sc.nextInt();
		    for(int j=0;j<k;j++)
		    {
		        int a =sc.nextInt();
		        int b = sc.nextInt();
		        int c = sc.nextInt();
		        for(int x=a;x<=b;x++)
		        {
		            arr[x]=arr[x]+c;
		        }
		    }
		    Arrays.sort(arr);
		System.out.println(arr[n-1]);
		}
		
	}
}