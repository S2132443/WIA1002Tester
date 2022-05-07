/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuto2;


// Create a generic class called Container that accepts one parameter, T.
public class Container<T> {
    
private T t; // Declare a private variable, t of type T
    
// Create a no-arg constructor
public Container(){} // Cannot be Container<T>(){}

// Example of constructor with argument
/*
  public Container(T initialize){
      this.t = initialize;
}
*/
    
    // Create a method, add that returns nothing, accepting a parameter of generic type.
    public void add(T t){
        this.t = t; // Initialize this parameter to the initially declared variable.
    }
    
    //  Create a generic method called retrieve() that returns the initially declared variable
    public T retrieve(){
        return t;
    }
    
    // Create a main method within the Container class
    public static void main(String[] args) {
        
        // Create two containers of type Integer and String. 
        Container<Integer> container1 = new Container<>();
        Container<String> container2 = new Container<>();
        
        // Append two objects to the containers, one of type Integer having value 50, another of type String
        // having value Java.
        container1.add(50);
        container2.add("Java");
        
        System.out.println("Container 1 contains " + container1.retrieve());
        System.out.println("Container 2 contains " + container2.retrieve());
    }
}
