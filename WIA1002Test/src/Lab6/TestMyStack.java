/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

//Write a test program for Q1(a) called TestMyStack class. 
public class TestMyStack {
    public static void main(String[] args) {
        // Create a stack of type Character from MyStack.
        MyStack<Character> charstack = new MyStack<>();
        //  Following the given order, add elements, a b and c in the stack.
        charstack.push('a');
        charstack.push('b');
        charstack.push('c');
        // Print the stack.
        System.out.println(charstack);
        //  Check if element ‘b’ is in the stack.
        System.out.println("Element 'b' is in the stack: " + charstack.search('b'));
        //  Check if element ‘k’ is in the stack.
        System.out.println("Element 'k' is in the stack: " + charstack.search('k'));
        
        // In the same test program as Q1(b), create a second stack of type integer.
        MyStack<Integer> intstack = new MyStack<>();
        //  Following the given order, add elements, 1 2 and 3 in the stack.
        intstack.push(1);
        intstack.push(2);
        intstack.push(3);
        // Print the stack.
        System.out.println(intstack);
        // Check if element ‘6’ is in the stack.
        System.out.println("Element 6 is in the stack: " + intstack.search(6));
    }
    
}
