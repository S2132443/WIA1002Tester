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
    
    //a. public void addFirst (E e)
    //b. public void addLast (E e)
    //c. public void add (int index, E e)
    //d. public E removeFirst ()
    //e. public E removeLast ()
    //f. public E remove (int index)
    
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
        if (tail == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;        
    }
    
    public void add (int index, E e){
        if (index < 0 || index > size) {
            return; // invalid index
        }
        if (index == 0) {
            addFirst(e);
        } else if (index >= size){
            addLast(e);
        } else {
            Node<E> cur = head;
            Node<E> newNode = new Node(e);
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            Node<E> nextNode = cur.next;
            cur.next = newNode;
            newNode.next = nextNode;
            size++;
        }
    }
    
    public E removeFirst (){
        if (head == null){
            return null;
        }
        Node<E> tobeRemoved = head;
        head = head.next;
        size--;
        if (head == null){
            tail = null;// incase 0 elements left
        }
        return tobeRemoved.element;
    }
    
    public E removeLast (){
        if (head == null){
            return null;
        } else if (size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> cur = head;
            while (cur != null && cur.next != null && cur.next.next != null){
                cur = cur.next;
            }
            Node<E> temp = tail;
            tail = cur;
            cur.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove (int index){
        if (index < 0 || index >= size){
            return null; // invalid index
        }
        if (index == 0){
            return removeFirst();
        } else if (index == size - 1){
            return removeLast();
        } else {
            Node<E> cur = head;
            for (int i = 0; i < index - 1; i++){
                cur = cur.next;
            }
            Node<E> temp = cur.next;
            cur.next = cur.next.next;
            size--;
            return temp.element;
        }
    }
    
    // QUESTION 4
    
    public void add(E e){
        Node<E> newNode = new Node (e);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public boolean contains(E e){
        Node<E> cur = head;
        while (cur != null) {
            if (cur.element.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            return head.element;           
        } else if (index == size - 1) {
            return tail.element;
        }  else {
            Node<E> cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.element;
        } 
    }
    
    public E getFirst() {
        if (head == null) {
            return null;
        }
        return head.element;
    }
    
    public E getLast() {
        if (tail == null) {
            return null;
        }
        return tail.element;
    }
    
    public int indexOf(E e) {
        int i = 0;
        Node<E> cur = head;
        while (cur != null) {
            if (cur.element.equals(e)) {
                return i;
            }
            cur = cur.next;
            i++;
        }
        return -1;
    }
    
    public int lastIndexOf(E e) {
        int i = 0, index = -1;
        Node<E> cur = head;
        while (cur != null) {
            if (cur.element.equals(e)) {
                index = i;
            }
            cur = cur.next;
            i++;
        }
        return index;
    }
    
    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            return null; // invalid index
        }
        if (index == 0) {
            Node<E> temp = head;
            head.element = e;
            return temp.element;
        } else {
            Node<E> cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            Node<E> temp = cur;
            cur.element = e;
            return temp.element;
        }
    }
    
    public void clear() {
        head =tail = null;
        size = 0;
    }
    
    public void print() {
        Node<E> cur = head;
        while (cur != null) {
            System.out.print(cur.element + "--> ");
            cur = cur.next;
        }
        System.out.println("");
    }
    
    public void reverse() {
        Node<E> cur = head;
        Object arr[] = new Object[size];
        int i = size - 1;
        while (cur != null) {
            arr[i--] = cur.element;
            cur = cur.next;
        }
        for (Object o : arr) {
            System.out.print(" <-- " + o);
        }
        System.out.println("");
    }
    
    public E getMiddleValue() {
        int index = size / 2;
        Node<E> cur = head;
        for (int i = 0; i < index; i++) {
           cur = cur.next; 
        }
        return cur.element;
    }
}
