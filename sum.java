//Sum
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
	      int sum=0;
	      for(int j=0;j<n;j++)
	      {
	          int x = sc.nextInt();
	          sum=sum+x;
	      }
	      System.out.println(sum);
	  }
	}
}