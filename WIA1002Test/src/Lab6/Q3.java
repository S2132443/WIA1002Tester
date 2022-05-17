/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

public class Q3 {
    public static void main(String[] args) {
        MyStack<Integer> S = new MyStack();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        S.push(6);
        
        int sum = 0;
        while (!S.isEmpty()) {
            sum += S.pop();
        }
        System.out.println("The sum is "+ sum);
    }
    
}
