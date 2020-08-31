//Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]

NOTE 1: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while(test-- > 0) {
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
    }
    int maxL = 0;
    int currMax = 0;
    int currL = 0;
     String result = "";
    int total = 0;
   StringBuffer sb = new StringBuffer();
   for(int i = 0; i < n; i++) 
{
    if(arr[i] >= 0) {
    total += arr[i];
    currL ++;
    sb.append(arr[i] +" ");
}
else {
if(total > currMax || (total == currMax && currL > maxL)) {
result = sb.toString();
maxL =currL;
currMax = total;
}
total = 0;
currLength = 0;
sb.delete(0, sb.length());

}
}
if(total > currMax || (total == currMax && currL > maxL)) {
result = sb.toString();
maxL =currL;
currMax = total;
}
System.out.println(result);
}
}
}