//Write a program to check if the sum of digits of a given number N is a palindrome number or not.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int sum(int n)
    {
        int rem=0;
        int sum=0;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public static String pal(int num)
    {
        int rem=0;
        int sum=0;
        int n =num;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==num)
        {
            return "YES";
        }
        else
        return "NO";
    }
    
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int s =sum(n);
		    System.out.println(pal(s));
		}
	}
}