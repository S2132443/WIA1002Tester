package LabTest1;



/*Create a class named “FashionStore” and extends “ShopLot” class.*/
public class Cat extends Pet{
    
//  Create a variable named “clothes” using “Item” class. 
    String name;

    public Cat(String name,String breed, int weight, String sickness) {
        super(breed,weight,sickness);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String printName() {
        return "Name: " + getName();
    }
    
    

}
