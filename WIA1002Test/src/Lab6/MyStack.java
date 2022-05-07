/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/* Create a generic stack called MyStack class using ArrayList. The MyStack generic class
should implement the following methods :
1) public void push(E 0);
2) public E pop();
3) public E peek();
4) public int getSize();
5) public boolean isEmpty();
6) public String toString();
7) public boolean search(E o);
*/
public class MyStack<E> {
    java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    
    public void push (E o){
        list.add(o);
    }
    
    public E pop() {
        
        if (isEmpty()){
            return null;
        }
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    
    public E peek() {
        return list.get(getSize() - 1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
    
    public boolean search(E o) {
        return list.contains(o);
    }
    
}
