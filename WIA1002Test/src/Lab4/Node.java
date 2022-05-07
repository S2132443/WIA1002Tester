/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

// Write the generic Node class consisting of two components of a node (i.e.:element, next)
class Node<E> {
    E element;
    Node<E> next;
    // with a default construct and a constructor that accepts an 
    // item assigned to the initially declared element variable.
        public Node (E o){
            element = o;
    }
}
