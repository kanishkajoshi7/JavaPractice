import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static int find(int n)
{
int arr[]={2,3,5,7,22,23,25,27,32,33,35,37,52,53,55,57,72,73,75,77,222,223,225,227,232,
233,235,237,252,253,255,257,272,273,275,277,322,323,325,327,332,333,335,

337,352,353,355,357,372,373,375,377,522,523,525,527,532,533,535,537,552,

553,555,557,572,573,575,577,722,723,725,727,732,733,735,737,752,753,755,

757,772,773,775,777,2222,2223,2225,2227,2232,2233,2235,2237,2252,2253,

2255,2257,2272,2273,2275,2277};
return arr[n-1];
}
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
System.out.println(find(n));
}

}
}