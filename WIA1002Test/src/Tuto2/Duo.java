/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuto2;

/**
 *
 * @author iwana
 */
// A Generic class named Duo the has two parameters A and B
public class Duo <A,B> { 
    private A first; // Declare a variable named first of type A
    private B second; // Declare a variable named second of type B
    
    // Create a constructor that accepts these two parameters
    public Duo(A a, B b) { // assign these parameters respectively to the declared vairables
        first = a; // or this.first = a;
        second = b; // or this.second = b;
    }   

    public static void main(String[] args) {
        // First object called sideShape consist of respectively String type and Integer type
        Duo<String, Integer> sideShape = new Duo<>("rectangle",5);
        // Second object called points consists of two Double types. 
        Duo<Double, Double> points = new Duo<>(20.1,20.3);
    }

}