//if a no is divisible by 8 :https://practice.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-8/0/ 
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
		    String s1 = sc.nextLine();
		   int a=0;
		    int l=s1.length();
		    if(s1.length()>3)
		    {
		        s1=s1.substring(l-3,l);
		         a = Integer.parseInt(s1);
		        
		    }
		    
		    else
		    {
		        a = Integer.parseInt(s1);
		    }
		        if(a%8==0)
		        {
		          System.out.println(1);
		        }
		        else
		        {
 		            System.out.println(-1);
		            
 		        
 		    }
	}
	}
}