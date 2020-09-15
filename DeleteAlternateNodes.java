//Given a Singly Linked List of size N, your task is to complete the function deleteAlt(), which starting from the second node delete all alternate nodes of the list.
class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        Node temp=head;
        System.out.print(temp.data+" ");
        while(temp.next!=null && temp.next.next!=null)
        {
            
            temp.next=temp.next.next;
            temp=temp.next;
            System.out.print(temp.data+" ");
        }
          
        
    }
}