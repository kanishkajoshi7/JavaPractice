//Given two Singly Linked List of N and M nodes respectively. The task is to check whether two linked lists are identical or not. 
Two Linked Lists are identical when they have same data and with same arrangement too.
class Solution {
    
    // Function which returns true if both linked
    // lists are identical else return false
    public boolean isIdentical (Node head1, Node head2){
        
        //write your code here and return true if they are identical, otherwise false
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data==temp2.data)
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}