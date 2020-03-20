
package a3;
import java.util.ArrayList;

public class MovieBST {
   static Node root; 
  
   
    Node sortedArrayToBST(ArrayList L, int start, int end) { 
  
     
        if (start > end) { 
            return null; 
        } 
  
        /* Get the middle element and make it root */
        int mid = (start + end) / 2; 
        Node node = new Node((Movie) L.get(mid)); 
  
        /* Recursively construct the left subtree and make it 
         left child of root */
        node.left = sortedArrayToBST(L, start, mid - 1); 
  
        /* Recursively construct the right subtree and make it 
         right child of root */
        node.right = sortedArrayToBST(L, mid + 1, end); 
          
        return node;  
}
     void preOrder(Node node) { 
        if (node == null) { 
            return; 
        } 
        System.out.println(node.mov1 + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    } 
}
