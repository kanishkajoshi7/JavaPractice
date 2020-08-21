import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  for(int i=0;i<t;i++)
	  {
	      int n =sc.nextInt();
	      int max=0;
	      Stack<Integer> e= new Stack<Integer>();
	      Stack<Integer> m= new Stack<Integer>();
	      for(int j=0;j<n;j++)
	      {
	          int a =sc.nextInt();
	          e.push(a);
	      }
	      for(int j=0;j<n;j++)
	      {
	          int p = e.pop();
	          if(j==0)
	          {
	              m.push(p);
	          }
	          else if(e.isEmpty())
	          {
	              if(p>=m.peek())
	              {
	                  m.push(p);
                          
	              }
	              break;
	          }
	         else if(p>=e.peek() && p>=m.peek())
	          {
	              m.push(p);
	          }
	      }
	      while(!m.isEmpty())
	      {
	          System.out.print(m.pop()+" ");
	      }
	      System.out.println();
	   }  
}
}