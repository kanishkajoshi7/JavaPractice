//Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int[] ar = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        
		    }
		    int k=sc.nextInt();
		    
		    int cnt=0;
		    
		    for(int i=0;i<n;i++)
		    if(ar[i]<=k)
		    cnt++;
		    
		   int max=Integer.MIN_VALUE;
		    
		    int good=0;
		    
		    int i;
		   for( i=0;i<cnt && i<n;i++){
		    if(ar[i]<=k)
		    good++;
		    
		    if(good>max)
		    max=good;
		   }
		   
		   while(i<n){
		       
		       if(ar[i-cnt]<=k)
		       good--;
		       
		       
		       if(ar[i]<=k)
		       good++;
		       
		       if(good>max)
		       max=good;
		       
		       i++;
		       
		   }
		   
		   System.out.println(cnt-max);
		   
		   
	 }
}
}
		  
	     