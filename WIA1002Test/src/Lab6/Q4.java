/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author iwana
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string with max 15 characters: ");
        String text = s.nextLine();
        while(text.length() > 15) {
            System.out.println("String is too long.");
            System.out.println("Enter a string with max 15 characters: ");
            text = s.nextLine();
        }
        MyStack<Character> st = new MyStack();
        String temp = "";
        for (int i = 0; i < text.length(); i++) {
            st.push(text.charAt(i));
        }
        while(!st.isEmpty()) {
            temp += st.pop();
        }
        System.out.printf("The string %s is palindromic: %b\n", text, temp.equals(text));
    }
    
}
