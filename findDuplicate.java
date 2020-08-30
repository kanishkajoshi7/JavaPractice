//Find duplicate under given constaraint
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int[] a = new int[10];
		    for(int i=0;i<10;i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		    for(int i=0;i<10;i++)
		    {
		        if(a[i]==a[i+1])
		        {
		            System.out.println(a[i]);
		            break;
		        }
		    }
		    
		}
	}
}