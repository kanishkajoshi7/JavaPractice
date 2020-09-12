//Given an array A[] representing the size of candles which reduces 1 unit in a day. The room is illuminated using given N candles, where N is the size of array A, the task is to find the maximum number of days the room is without darkness.
class  Solution
{
    long maxDays(long a[], int n)
    {
       int max=0;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]>max)
	        {
	            max=a[i];
	        }
	    }
	    return max;
	
    }
}