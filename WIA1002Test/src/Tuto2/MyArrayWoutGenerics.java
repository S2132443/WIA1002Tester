/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuto2;

/**
 *
 * @author iwana
 */
public class MyArrayWoutGenerics {
   public static void main(String[] args) {
        int[]number = {1,2,3,4,5};
        String[]name = {"Jane","Tom","Bob"}; 
        char[]alphabet = {'a','b','c'};
        
        listAll(number);
        //listAll(name);
        //listAll(alphabet);
    }
    
    public static void listAll(int[]list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
        System.out.println();
    } 
}
