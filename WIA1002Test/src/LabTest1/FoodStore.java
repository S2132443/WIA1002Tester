package LabTest1;

//Create a class named “FoodStore” and extends “ShopLot” class.


//Create a class named “FoodStore” and extends “ShopLot” class.
public class FoodStore extends ShopLot implements Comparable<FoodStore>{

    Item<String> [] menu; //  Create a variable named “menu” using “Item” class*/

    public FoodStore(String shopName, Person contactPerson, Item<String> [] menu, Person [] employee) {
        super(shopName,contactPerson,employee);
        this.menu = menu;
    }
    /*Overrides “compareTo()” method to compare with another food store in terms
    of number of employees.*/
    @Override
    public int compareTo(FoodStore obj) {
        if (getEmployee().length > obj.getEmployee().length) {
            return 1;
        } else if (getEmployee().length < obj.getEmployee().length) {
            return -1;
        } else {
            return 0;
        }
    }

    public StringBuilder printMenu() {
        StringBuilder result = new StringBuilder("menu=[");
        for (int i = 0; i < menu.length; i++) {
            result.append("Item{item=").append(menu[i].getItem()).append(", price=").append(menu[i].getPrice()).append("}, ");
        }
        result.replace(result.length()-2,result.length(),"");
        result.append("]");
        return result;
    }
    
    /*Overrides “equals()” method to compare with another food store in terms of
    contact name.*/
    @Override
    public boolean equals(Object o) {
        return getContactPerson().contactPerson.equals(((FoodStore)o).getContactPerson().contactPerson);
    }

    public String display() {
        return "ShopLot{" + super.printShopName() + ", " + super.printContactPerson() + printMenu() +
                ", " + super.printEmployee() + "}";
    }

    public String toString() {
        return getShopName();
    }
}
