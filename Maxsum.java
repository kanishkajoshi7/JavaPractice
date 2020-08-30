//Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array. The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
Input:
N = 4
A[] = {8,3,1,2}
Output: 29
Explanation: Above the configuration
possible by rotating elements are
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
Here the max sum is 29 
class GfG
{
    int max_sum(int a[], int n)
    {
	  int sum=0;
     int totalsum=0;
     int result=0;
     for(int i=0;i<n;i++) 
    { sum+=a[i];
    totalsum+=a[i]*i ;
        
    }
     result=totalsum;

    for(int i=n-1;i>=0;i--)
    {
      totalsum=(sum-a[i]) + (totalsum - a[i]*(n-1));

     if(result < totalsum)
     {
      result=totalsum;
      }
    }
    return result;
}
}