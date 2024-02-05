import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.
        Node temp = head;
        
        Node newNode = new Node(val);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        if(pos == n){
            for(int i=0;i<n-1;i++){
                temp = temp.next;
            }
            temp.next = newNode;
            return head;
        }
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head; 
    }
}
