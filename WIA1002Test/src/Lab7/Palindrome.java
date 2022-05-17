/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab7;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        MyQueue<Character> q = new MyQueue();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = s.nextLine();

        for (int i = 0; i < text.length(); i++) {
            q.enqueue(text.charAt(i));
        }

        boolean isPalindrome = true;
        System.out.println(q.toString());
        for (int i = text.length()-1; i >= 0; i--) {
            if (text.charAt(i) != q.dequeue()) {
                isPalindrome = false;
                break;
            }
            System.out.println(q.toString());
        }
        System.out.println(q.toString());
        System.out.printf("The text %s is palindrome: %b\n", text, isPalindrome);
    }
    
}
