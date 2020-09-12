//Given an array Arr of N positive integers and a number K where K is used as a threshold value to divide each element of the array into sum of different numbers. Find the sum of count of the numbers in which array elements are divided.
class Solution {
    int totalCount(int[] arr, int n, int k) {
        // code here
         int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
                count+=arr[i]/k;
            }
            else
            {
                count+=arr[i]/k +1;
            }
        }
        return count;
    }
}