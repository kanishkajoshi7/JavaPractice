//Display Longest String
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    sc.nextLine();
		    String[] s = new String[n];
		    int l=0;
		    int max=0;
		    int index =0;
		    for(int j=0;j<n;j++)
		    {
		        s[j]=sc.nextLine();
		         
		    }
		    for(int j=0;j<n;j++)
		    {
		        l=s[j].length();
		        if(max<l)
		        {
		            max=l;
		            index=j;
		        }
		         
		    }
		    System.out.println(s[index]);
		    
		    
		}
	}
}