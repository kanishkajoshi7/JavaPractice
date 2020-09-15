//Given a single linked list of size M, your task is to complete the function sumOfLastN_Nodes(), which should return the sum of last N nodes of the linked list.
class Solution {
    
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      Node temp=head;
      Node temp1=head;
      int c=0;
      int sum1=0;
      int sum2=0;
      while(temp!=null)
      {
          c++;
          sum1+=temp.data;
          temp=temp.next;
          
      }
      int r = c-k;
      while(r-->0)
      {
          sum2+=temp1.data;
          temp1=temp1.next;
      }
      return sum1-sum2;
    }
}