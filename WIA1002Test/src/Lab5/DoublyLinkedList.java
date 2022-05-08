/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author iwana
 */
public class DoublyLinkedList<E> {
    public class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;
        
        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
        public Node (E element) {
            this (element, null, null);
        }
    }
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DoublyLinkedList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void addFirst(E element) {
        //Create object tmp and set pointer of the new node
        Node<E> tmp = new Node(element, head, null);
    }
}
