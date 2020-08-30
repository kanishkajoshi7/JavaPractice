import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     for(int i=0;i<t;i++)
	     {
	         int b = sc.nextInt();
	         if(b<100)
	         {
	             System.out.println("Number should be atleast three digits");
	         }
	         else
	         {
	             String p = Integer.toString(b);
                 String q = Integer.toString(b*2);
                 String r = Integer.toString(b*3);
                 String str = p+q+r;
                 char c[] = str.toCharArray();
                 Arrays.sort(c);
                 String a = new String(c);
                 String cmp = "123456789";

                 if(a.equals(cmp)){
                 System.out.println("Fascinating");
                 }
                 else{
                  System.out.println("Not Fascinating");
                }
	         }
	     }
	}
}