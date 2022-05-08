/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab5;

/**
 *
 * @author iwana
 */
public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        
        list.display();
        
        System.out.println("Remove the first string: " + list.removeInitial());
        System.out.println("\"difficult\" is in the list: " + list.contains("difficult"));
        list.clear();
        list.display();
    }
    
}
