/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab2;

public class Q2 {
    // Create a test program that creates two instances of generic class of type String called strObj and of type Integer called intObj.
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
        // Set a value for each of these objects. 
        strObj.setE("test"); 
        intObj.setE(123);
        
        // Display these values using the getter method.
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
        
    }
    
}
