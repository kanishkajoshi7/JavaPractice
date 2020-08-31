//Given an array arr[] of N integers. Do the following operation n-1 times. For every Kth operation:

Right rotate the array clockwise by 1.
Delete the (n-k+1)th last element.
Now, find the element which is left at last.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while(t-- > 0)
    {
     int n = sc.nextInt();
     ArrayList l = new ArrayList<>();
     for(int i = 0 ; i < n ; i++) 
     {
      int temp = sc.nextInt();
      l.add(temp);
      }
     int del = 1;
    while(l.size() != 1)
    {
      l.add(0 , l.get(l.size() - 1));
      l.remove(l.size() - 1);
     if((l.size() - 1 ) - del + 1 >=0 )
      {
      l.remove((l.size() - 1) - del + 1);
     }
    else
    {
      l.remove(0);
     }
    del++;
    }
     System.out.println(l.get(0));
}
}
}