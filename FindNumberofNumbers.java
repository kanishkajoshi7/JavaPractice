//Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.
class GfG
{
          public static int num(int a[], int n, int k)
            {
                 //Your code here
                 int sum=0;
                 for(int i=0;i<n;i++)
                 {
                     sum+=count(a[i],k);
                 }
                  return sum;
                 
            }
            public static int count(int n, int k)
            {
                int rem=0;
                int x=n;
                int count=0;
                while(x>0)
                {
                    rem=x%10;
                    if(rem==k)
                    {
                        count++;
                    }
                    x=x/10;
                }
                return count;
            }
}