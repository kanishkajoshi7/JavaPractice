//Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.
class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    int[] a = new int[n];
	    int z=0;
	    int o=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==0)
	        {
	            z++;
	        }
	        else
	        {
	            o++;
	        }
	    }
	   
	    for(int i=0;i<z;i++)
	    {
	        arr[i]=0;
	       
	    }
	    for(int i=z;i<n;i++)
	    {
	        arr[i]=1;
	    }
	    }
	  
	    return arr;
	    
	} 
} 