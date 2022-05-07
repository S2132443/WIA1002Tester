/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author iwana
 */
// Write a class called MyLinkedList. The class should have the following :
public class MyLinkedList<E> {
    
    // Nodes for head and tail
    Node<E> head;
    Node<E> tail;
    int size;
    
    // Default constructor
    public MyLinkedList (){
        size = 0;
    }
    
    public void addFirst(E e) {
        Node<E> newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node (e);
        
    }
    
}
