//Given an array of size N consisting of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.
class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if((mid==0 || arr[mid-1]==1) && arr[mid]==0)
            {
                return n-mid;
            }
            else if(arr[mid]==1)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }

}
