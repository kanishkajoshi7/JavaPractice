//Bitwise :https://practice.geeksforgeeks.org/problems/bitwise-operators-java/1
class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        // Your code here
        
        
        System.out.println(a^a);
        System.out.println(c^b);
        System.out.println(a&b);
        System.out.println(c | (a^a));
        System.out.println(~(c^b));
    }
}