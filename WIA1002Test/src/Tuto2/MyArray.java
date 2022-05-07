/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuto2;

/**
 *
 * @author iwana
 */
//Create a class called MyArray that has two methods, a main method that creates 3 arrays of
/*
a) integer containing the numbers 1,2,3,4 and 5
b) string containing names, Jane, Tom and Bob
c) character containing alphabet, a, b and c
 and a generic method listAll that displays the list of arrays.
*/
public class MyArray {
    public static void main(String[] args) {
        Integer[]number = {1,2,3,4,5};
        String[]name = {"Jane","Tom","Bob"}; 
        Character[]alphabet = {'a','b','c'};
        
        MyArray.listAll(number);
        MyArray.listAll(name);
        MyArray.listAll(alphabet);
    }
    
    public static <E> void listAll(E[]list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
        System.out.println();
    }
}
