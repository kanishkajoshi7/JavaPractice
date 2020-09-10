//Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.
class Reverse{
    
    // Function to reverse array in group of k 
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<k;i++)
        {
            s.push(mv.get(i));
        }
        for(int i=0;i<k;i++)
        {
            al.add(s.pop());
        }
        if(n>=k)
        {
            for(int i=k;i<n;i++)
        {
            al.add(mv.get(i));
        }
        }
        return al;
        
        
        
    }
    
}