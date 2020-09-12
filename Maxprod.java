//Given an array Arr of size N with all elements greater than or equal to zero. Return the maximum product of two numbers possible.
import java.util.*;
import java.io.*;
public class Solution
{
  public static void main(String[] args)
  {
     Scanner sc = new Scannee(System.in);
     int n = sc.nextInt();
     int[] arr = new int[];
     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();
     }
      Arrays.sort(arr);
      System.out.println(arr[n-1]*arr[n-2]);
  }
}