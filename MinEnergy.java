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
		    int[] a = new int[n];
		    
		    int min=1;
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		      
		    }
		   for(int k=0;;k++, min++) {
				int sum = min;
				for(int j =0; j<n; j++) {
					sum += a[j];
					if(sum <= 0) 
						break;
				}
				if(sum > 0)
					break;
			}
		    System.out.println(min);
		}
	}

}