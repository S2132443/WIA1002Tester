/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab2;

/*
 Create a test program that creates three objects of the StorePair
generic class called a, b and c. Set the first and second values of a, b, c as (6,4), (2,2), (6,3).
 */

public class TestRunQ1 {

    
    public static void main(String[] args) {
        
        StorePairGeneric<Integer> a = new StorePairGeneric<> (6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<> (2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<> (6, 3);
        
        //  Invoke the compareTo()and equals() methods that compares the three objects created in (d) in the test program.

        System.out.println("USING COMPARETO METHOD");
        System.out.println("0 for same, -1 for otherwise");
        System.out.println("Comparing the first values of a and b: " + a.compareTo(b));
        System.out.println("Comparing the first values of a and c: " + a.compareTo(c));
        System.out.println("Comparing the first values of b and c: " + b.compareTo(c));
        
        System.out.println("\nUSING EQUALS METHOD");
        System.out.println("Comparing the first values of a and b: " + a.equals(b));
        System.out.println("Comparing the first values of a and c: " + a.equals(c));
        System.out.println("Comparing the first values of b and c: " + b.equals(c));
        
    }
    
}
