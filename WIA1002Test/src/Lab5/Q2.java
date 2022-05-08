/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab5;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SList<String> students = new SList();
        
        System.out.println("Enter you student name list. Enter 'n' to end...");
        String name = "";
        while (true) {
            name = s.nextLine();
            if (name.equals("n")) break;
            students.add(name);
        }
        
        System.out.println("\nYou have entered the following students' name: ");
        students.printList();
        
        System.out.println("\nThe number of students entered is: " + students.getSize());
        while (true){
            System.out.println("\nAll the names entered are correct ? Enter 'r' to rename the student name, 'n' to proceed");
            String choice = s.nextLine();
            if (choice.equals("n")){
                break;
            } else if ((choice.equals("r"))){
                System.out.println("\nEnter the existing student name that u want to rename: ");
                name = s.nextLine();
                System.out.println("\nEnter the new name: ");
                String newName = s.nextLine();
                students.replace(name, newName);
                System.out.println("\nThe new student list is: ");
                students.printList();
            } else {
                System.out.println("Please enter a valid input");
            }
        }
        
        System.out.println("\n All data saved");
            
        }
        
    }
 
