/*Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.
Example 1:
Input:
N = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6) */

static int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
        // add your code here
       
      Map<Integer, Integer> m= new HashMap<Integer,Integer>();
      int count = 0;
      int sum = 0;
      for(int i=0;i<N;i++)
      {
        sum += arr[i] == 0 ? -1 : 1;
        if(sum == 0)
        {
          count++;
        }
        if(m.containsKey(sum)) 
        {
          count += m.get(sum);
        }
        int value = m.getOrDefault(sum, 0);
       m.put(sum, value + 1);
     }
     return count;

    }
}