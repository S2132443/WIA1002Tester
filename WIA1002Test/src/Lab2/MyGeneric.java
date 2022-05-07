/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;


public class MyGeneric<E> { // Create a generic class called MyGeneric that accepts one parameter.
    private E e; // Declare a variable called e for the type parameter.
    
    public MyGeneric(){ //  Create a no-arg constructor.
    
    }
    public MyGeneric(E e){ // Create a constructor that accepts one generic parameter
        this.e = e;
    }
    
    public E getE() { // Create a getter method for the generic type.
        return e;
    }
    
    public void setE(E e) { // Create a setter method for the generic type.
        this.e = e;
    }
}
