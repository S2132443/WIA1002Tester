/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab7;

/**
 *
 * @author iwana
 */
public class MyQueueTest {

    public static void main(String[] args) {
        String [] arr = {"Durian","Blueberry"};
        MyQueue<String> fruitQ = new MyQueue(arr);
        // MyQueue<String> fruitQ = new MyQueue (new String [] {"Durian","Blueberry"});
        
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println("The queue is: ");
        System.out.println(fruitQ);
        
        System.out.println("The top item is " + fruitQ.peek());
        System.out.println("The queue size is " + fruitQ.getSize());
        
        fruitQ.dequeue();
        System.out.println("Removed Durian from the queue");
        System.out.println(fruitQ);
        System.out.println("The item in index 2 is " + fruitQ.getElement(2));
        
        System.out.println("Queue consists of Cherry: " + fruitQ.contains("Cherry"));
        System.out.println("Queue consists of Cherry: " + fruitQ.contains("Durian"));
    }
    
}
