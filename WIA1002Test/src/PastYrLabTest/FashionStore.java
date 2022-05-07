package PastYrLabTest;

/*Create a class named “FashionStore” and extends “ShopLot” class.*/
public class FashionStore extends ShopLot{
    
//  Create a variable named “clothes” using “Item” class. 
    Item<String> [] clothes;

    public FashionStore(String shopName, Person contactPerson, Item<String> [] clothes, Person [] employee) {
        super(shopName,contactPerson,employee);
        this.clothes = clothes;
    }

    public StringBuilder printClothes() {
        StringBuilder result = new StringBuilder("menu=[");
        for (int i = 0; i < clothes.length; i++) {
            result.append("Item{item=").append(clothes[i].getItem()).append(", price=").append(clothes[i].getPrice()).append("}, ");
        }
        result.replace(result.length()-2,result.length(),"");
        result.append("]");
        return result;
    }

    public String display() {
        return "ShopLot{" + super.printShopName() + ", " + super.printContactPerson() + printClothes() +
                ", " + super.printEmployee() + "}";
    }

    public String toString() {
        return getShopName();
    }
}
