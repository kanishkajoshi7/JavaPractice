//Given a singly linked list, find if the linked list is circular or not. A linked list is called circular if it not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.
class GfG
{
    boolean isCircular(Node head)
    {
        Node fast=head.next;
        Node slow=head;
        if(head==null)
        {
            return false;
        }
        while(fast!=null && fast.next!=null && slow!=null)
        {
            if(fast==slow)
            {
                return true;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }