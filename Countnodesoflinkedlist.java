//Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

import java.util.*;
import java.io.*;

class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
  }
}
class LinkedList
{
 public static int getCount(Node head)
    {
        Node temp =head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp= temp.next;
        }
        return count;
  public static void main(String[] args)
  {
      System.out.println(getcount(head));
   }
}