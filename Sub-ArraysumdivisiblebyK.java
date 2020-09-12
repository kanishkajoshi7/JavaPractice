//You are given an array A of N positive and/or negative integers and a value K. The task is to find the count of all sub-arrays whose sum is divisible by K.
class Solution
{
    long subCount(long arr[] ,int n,int k)
    {
      HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
      hm.put(0,1);
      int rsum=0;
      int count=0;
      for(int i=0;i<n;i++)
      {
          rsum+=arr[i];
          int rem = rsum%k;
          if(rem<0)
          {
              rem+=k;
          }
          if(hm.containsKey(rem))
          {
              count+=hm.get(rem);
          }
          hm.put(rem,hm.getOrDefault(rem,0)+1);
          
      }
       return count;
        
        
    }
}