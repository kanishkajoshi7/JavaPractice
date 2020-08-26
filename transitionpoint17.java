// Transition point :https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1
class GfG 
{
    int transitionPoint(int arr[], int n) 
    {
        int l = 0, h = n-1;
    
    while(l <= h)
    {
        int mid = l + (h-l)/2;
        
        if(arr[mid] == 1 && (mid-1 < 0 || arr[mid-1] == 0))
        {
            return mid;
        }
        
        if(arr[mid] == 1)
        {
            h = mid-1;
        }
        else
        {
            l = mid+1;
        }
    }
    
    return -1;
    }
}