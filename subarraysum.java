//Given an array containing N integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.
Input : arr[] = { 10, 5, 2, 7, 1, 9 }, 
K = 15
Output : 4
The sub-array is {5, 2, 7, 1}.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n,k;
	     n=sc.nextInt();
	     k=sc.nextInt();
	     int arr[]=new int[n+1];
	     for(int i=1;i<=n;i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	     HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
	     int sum=0;
	     int ans=0;
	     m.put(0,0);
	     for(int j=1;j<=n;j++)
	     {
	         sum=sum+arr[j];
	         if(m.containsKey(sum-k)==true)
	         {
	             ans=Math.max(ans,j-m.get(sum-k));
	         }
	         if(m.containsKey(sum)!=true){
	             m.put(sum,j);}
	     }
	     System.out.println(ans);
	 }
		}    
}
    
