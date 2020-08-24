//format array:https://practice.geeksforgeeks.org/problems/play-with-an-array/1
class GfG
{
	public int[] formatArray(int[] a,int n)
        {
           for(int i=1;i<n;i=i+2)
           {
               if(a[i]<a[i-1])
               {
                   int temp=a[i];
                   a[i]=a[i-1];
                   a[i-1]=temp;
               }
           }
           return a;
	}
}