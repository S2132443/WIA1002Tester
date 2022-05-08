/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;
    
    public SList() {
        size = 0;
    }
    public int size() {
        return size;
    }
    public void appendEnd(E e) {
        SNode<E> newNode = new SNode(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public E removeInitial() {
        if (head == null) return null;
        SNode<E> tobeRemoved = head;
        head = head.next;
        size--;
        if (head == null) tail = null; // incase left 0 element
        return tobeRemoved.element;
    }
    
    public boolean contains(E e){
        SNode<E> cur = head;
        while (cur != null) {
            if (cur.element.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    
    public void clear() {
        head = tail = null;
        System.out.printf("successfully clear %d node(s)\n", size);
        size = 0;
    }
    
    public void display() {
        SNode<E> cur = head;
        while (cur != null) {
            System.out.print(cur.element + " --> ");
            cur = cur.next;
        }
        System.out.println("");
    }
    
    // For question 2
    public void add(E e) {
        SNode<E> newNode = new SNode(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void removeElement(E e) {
        SNode<E> prev = null, cur = head;
        while (cur != null) {
            if (cur.element.equals(e)) {
                head = head.next;
                if (head == null) {
                    tail = null; // if 1 element in the list
                }
            } else {
                prev.next = cur.next;
                if (cur.next == null) {
                    tail = prev;
                }
            }
            size--;
            return;            
        }
        prev = cur;
        cur = cur.next;
    }
    
    public void printList() {
        SNode<E> cur = head; 
        for (int index = 0; index < size; index++) {
            System.out.print(cur.element + " ");
            cur = cur.next;
        }
        System.out.println("");
    }
    
    public int getSize() {
        return size;
    }
    
    public void replace (E e, E newe){
        int index = 0;
        SNode<E> cur = head;
        SNode<E> temp1 = head;
        SNode<E> temp2 = head.next;
        
        for (int i = 1; i <= size; i++) {
            if(e == cur.element){
                index = i;
                break;
            } else if(i < size){
                cur = cur.next;
            }
        }
        System.out.println("Index is " + index);
        
        for (int i = 1; i < index; i++) {
            temp1 = temp1.next;
        }
        
        if(index<size){
            for (int i = 1; i < index; i++) {
                temp2 = temp2.next;
            }
        }
        
        SNode<E>replace = new SNode<>(newe);
        
        // if replace index 1
        if (index == 1) {
            System.out.println("If replace first");
            replace.next = head.next;
            head = replace;
            cur = cur.next = null;
        }
        
        // if replace at last index
        if (index == size) {
            System.out.println("If replace last");
            tail = replace;
            temp1.next = replace;
        }
        
        // if replace middle
        if (index == 1) {
            System.out.println("If replace first");
            temp1.next = replace;
            cur.next = null;
            replace.next = temp2;
        }
    }
}
