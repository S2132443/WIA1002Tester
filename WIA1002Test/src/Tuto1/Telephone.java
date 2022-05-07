/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tuto1;

/**
 *
 * @author iwana
 */
public class Telephone {
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject = 0;
    
    Telephone(String areaCode, int number){
    this.areaCode = areaCode;
    this.number = number;
    numberOfTelephoneObject++;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
    
    // main class
    public static void main(String[] args) {
        Telephone [] phoneArray = new Telephone [5];
        
        int number = 7967300;
        
        for (int i=0; i<5; i++){
            phoneArray[i] = new Telephone ("03",number++);
        }
        for (int i=0; i<numberOfTelephoneObject; i++){
            System.out.println(phoneArray[i].makeFullNumber());
        }
    }
    
    
    
}
