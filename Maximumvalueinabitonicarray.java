//Given an array Arr of N elements which is first increasing and then may be decreasing, find the maximum element in the array.
import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt(); 
     }
      int ans = new solution.findMaximum();
      System.out.println(ans);
     
  }
} 
class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-1];
    
    }
}