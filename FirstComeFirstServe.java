//CodeMart is an online shopping platform and it is distributing gift vouchers to its esteemed users. The voucher can be redeemed by providing a fixed amount of shopping credits.Each credit is sent by a user one by one. Since there is a huge rush of people you are required to manage the users on the basis of first come first serve. The user which comes first and has k occurrences of credits is given the voucher first. You are given an array with the id's of the users in chronological order of the credits sent by them. You are required to print the id of the user which will be served first. If no such user meets the condition print "-1".    
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
		    int k = sc.nextInt();
		    LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		    for(int i=0;i<n;i++)
		    {
		        int a = sc.nextInt();
		        if(hm.containsKey(a))
		        {
		           hm.put(a,hm.get(a)+1);
		        }
		        else
		        {
		            hm.put(a,1);
		        }
		    }
		    boolean b = false;
		   for(Map.Entry x:hm.entrySet())
		   {
		        
		        if((int)x.getValue()==k)
		        {
		           b=true;
		            System.out.println(x.getKey());
		            break;
		        }
		    }
		    if(!b)
		    {
		        System.out.println(-1);
		    }
		}
	}
}