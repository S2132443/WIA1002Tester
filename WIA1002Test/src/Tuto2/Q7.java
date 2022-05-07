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
public class Q7 {
    // Assume that the following objects were created
    ArrayList<String> vehicle = new ArrayList<>();
    ArrayList<Object> transportation = new ArrayList<>();
    
    /*Declare a method header for generic method,allTransportation that returns nothing,which accepts
    two ArrayList parameters using the wildcards.*/
    
    //The Answer:
    //public static <T> void allTransportation (ArrayList<T>list1, ArrayList<? super T> list2)// Lower bound
    //public static <T> void allTransportation (ArrayList<? extends T> list1, ArrayList<T> list2)// Upper bound
}
