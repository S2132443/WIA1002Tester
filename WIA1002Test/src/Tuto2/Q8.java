/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuto2;

import java.util.ArrayList;

/**
 *
 * @author iwana
 */
public class Q8 {
    // Assuming that two new object are created as follows 
    ArrayList<Integer> numOfCars = new ArrayList<>();
    ArrayList<Double> milesPerHour = new ArrayList<>();
    
    // Using the <?> wildcard, implement a generic method that displays the list.
    
    public static void print(ArrayList<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    
    }

}
