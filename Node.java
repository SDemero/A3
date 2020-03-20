/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

/**
 *
 * @author samueldemero
 */
class Node { 
      
    Movie mov1; 
    Node left, right; 
      
    Node(Movie d) { 
        mov1 = d; 
        left = right = null; 
    } 
} 
