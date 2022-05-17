/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

import java.util.Scanner;

// Write a new test program for Q1(a) called TestIntMyStack class
public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> intstack = new MyStack<>();
        Scanner input = new Scanner(System.in);  
        // Prompt user to enter an integer value.
        System.out.print("Enter an integer value: ");
        int user = input.nextInt();
        
        // Push the values 1 through the user entered value onto the stack
        for (int i = 1; i <= user; i++) {
            intstack.push(i);
        }
        System.out.println(intstack);
        // Print the size of the stack.
        System.out.println("Size of Stack is: " + intstack.getSize());
        
        // Display the contents of the stack by repeatedly calling pop() until the
        System.out.println("The elements inside the stack is ");
        for (int i = user; i > 0; i--) {
            System.out.println(intstack.pop());
        }
    }
    
}
