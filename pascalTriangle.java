//Pascal Triangle
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int k =sc.nextInt();
            int C = 1;// used to represent C(line, i) 
            for(int j = 1; j <= k; j++) 
            {  
            // The first value in a line is always 1 
              System.out.print(C+" "); 
              C = C * (k - j) / j;  
            } 
         System.out.println();
		} 
    } 
		    
		}
	
