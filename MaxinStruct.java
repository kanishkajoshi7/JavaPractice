//Max in struct Array :https://practice.geeksforgeeks.org/problems/maximum-in-struct-array/1
import java.util.*;
import java.io.*;

class Height
{
  int height;
  int inches;
  public Height(int height,int inches)
  {
    this.height=height;
    this.inches=inches;
  }
}
 class Maximum
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t--> 0)
    {
      int n=sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
         int f = sc.nextInt();
         int i = sc.nextInt();
         arr[i]=new Height(f,i);
      }
     Max m = new Max();
     int res=m.findMax(arr,n);
      System.out.println(res);
    }
  }
}
 class Max
{
  public int Max(int[] arr , int n)
  {
    int max=0;
    int ht=0;
    int ft=12;
    for(int i=0;i<n;i++)
    {
       ht=arr[i].feet*12+arr[i].inches;
       if(ht>max)
       {
            max=ht;
       }
    }
       return max;
  }
}