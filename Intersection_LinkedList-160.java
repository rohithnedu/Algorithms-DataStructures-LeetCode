/* Write a program to find the node at which the intersection of two singly linked lists begins.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        
        int len_headA = getLength(headA); 
        int len_headB = getLength(headB);
        
        
        while( len_headA > len_headB ) {
            
            headA = headA.next;
            len_headA--;
            
        }
        
        
        
        
          while (len_headA < len_headB) {
       
      
              headB = headB.next;
              len_headB--;
         }
        
        
        
        
        while( headA  !=  headB) {
            headA = headA.next;
            headB = headB.next;
            
        }
        return headA;
        
    }
    
    
    private int getLength(ListNode node) {
         int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
        
    }
}