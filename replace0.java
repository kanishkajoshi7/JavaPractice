// replace 0 with 5:https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1
class GfG {
    int convertfive(int num) {
        String s = Integer.toString(num);
        int l =s.length();
        s=s.replace("0","5");
        int n = Integer.parseInt(s);
        return n;
    }
}