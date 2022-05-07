/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4;

/**
 *
 * @author iwana
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList ();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        System.out.println("The list is ");
        list.print();
        System.out.println("");
        
        System.out.println("The reverse list is ");
        list.reverse();
        System.out.println("");
        
        System.out.println("The size of the list is " + list.size + "\n");
        
        System.out.println("First element is " + list.getFirst());
        System.out.println("Last element is " + list.getLast());
        System.out.println("");
        
        System.out.printf("Remove the middle element %s from the list\n", list.remove(list.size/2));
        list.print();
        
        System.out.println("Index of the second value b is " + list.indexOf('b'));
        System.out.println("Index of the third value c is " + list.indexOf('c'));
        
        System.out.println("The list consists of value 'c': " + list.contains('c'));
        
        Character arr[] = {'h','e','l','l','o'};
        for (int i = 0; i < arr.length; i++) {
            if (i < list.size) {
                list.set(i, arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        list.print();
        
        System.out.println("The middle element is " + list.getMiddleValue());
    }  
}
