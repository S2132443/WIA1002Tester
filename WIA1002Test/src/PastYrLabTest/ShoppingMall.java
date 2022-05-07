package PastYrLabTest;


// Create a “ShoppingMall” class with main method. 
public class ShoppingMall {
    
    public static void main(String[] args) {
        /*Within the main method, create an “foodStores” variable that stores a list of
        shoplots as food stores. */
        FoodStore f1 = new FoodStore("Shushi Mentai",new Person("Max","0112233445"),new Item[] {new Item<String>("Chicken",10), new Item<String>("Ramen",12)}, new Person[] {new Person("Adam",null), new Person("Alex",null), new Person("Andrew",null)} );
        FoodStore f2 = new FoodStore("McDonalds", new Person("Mike","0101122334"), new Item[] {new Item<String>("Burger",10), new Item<String>("Fried Chicken",12)}, new Person[] {new Person("Jack",null), new Person("Jane",null)});
        FoodStore f3 = new FoodStore("Waroeng Penyet", new Person("Mike","0101122334"), new Item[] {new Item<String>("Ayam Penyet",10)}, new Person[] {new Person("Lex",null), new Person("Leon",null)});
        
        /*Within the main method, create a “fashionStores” variable that stores a list of
        shoplots as fashion stores. */
        FashionStore s1 = new FashionStore("Mango", new Person("Nicole","0194433221"), new Item[] {new Item<String>("Dress",120)}, new Person[] {new Person("Ron",null), new Person("John",null)});
        FashionStore s2 = new FashionStore("Uniqlo", new Person("Nate","0199988776S"), new Item[] {new Item<String>("Shirt",80), new Item<String>("T-shirt",60)}, new Person[] {new Person("Kate",null), new Person("Ken",null), new Person("Kurt",null)});
        FashionStore s3 = new FashionStore("Padini", new Person("Nate","0195544332"), new Item[] {new Item<String>("Skirt",80), new Item<String>("Blouse",100)}, new Person[] {new Person("Frank",null), new Person("Felix",null)});
        
        // Print the details for Sushi Mentai and Mango
        System.out.println(f1.display());
        System.out.println(s1.display());
        
        /*Print the shop name that have the highest number of employees for each “foodStore”
        and “fashionStore”. */
        System.out.println("Food store with highest number of employees: " + highest(f1,f2,f3));
        System.out.println("Fashion store with highest number of employees: " + highest(s1,s2,s3));

        String highest;
        String lowest;
        if (f1.compareTo(f3) > 0) {
            highest = f1.getShopName();
            lowest = f3.getShopName();
        } else {
            highest = f3.getShopName();
            lowest = f1.getShopName();
        }

        // Print if any of the food store is having the same or different contact person. 
        if (f2.equals(f1)) {
            System.out.println("The contact person for " + f2 + " and " + f1 + " is the same");
        } else {
            System.out.println("The contact person for " + f2 + " and " + f1 + " is different");
        }

        if (f2.equals(f3)) {
            System.out.println("The contact person for " + f2 + " and " + f3 + " is the same");
        } else {
            System.out.println("The contact person for " + f2 + " and " + f3 + " is different");
        }

        if (f1.equals(f3)) {
            System.out.println("The contact person for " + f1 + " and " + f3 + " is the same");
        } else {
            System.out.println("The contact person for " + f1 + " and " + f3 + " is different");
        }
        
        // Print which food store is having more employees, between Sushi Mentai and Waroeng Penyet. 
        System.out.println(highest + "have more employees than " + lowest);

        // Print the most expensive item for McDonalds and Padini.
        System.out.println("The most expensive item in McDonalds is " + expensive(f2.menu));
        System.out.println("The most expensive item in Padini is " + expensive(s3.clothes));
    }

    public static <T extends ShopLot> T highest(T shop1, T shop2, T shop3) {
        if (shop1.getEmployee().length > shop2.getEmployee().length && shop1.getEmployee().length > shop3.getEmployee().length) {
            return shop1;
        } else if (shop2.getEmployee().length > shop1.getEmployee().length && shop2.getEmployee().length > shop3.getEmployee().length) {
            return shop2;
        } else {
            return shop3;
        }
    }

    public static <T extends String> Item<T> expensive(Item<T> [] list) {
        Item<T> mostExpensive = list[0];
        for (int i = 0; i < list.length; i++) {
            if (mostExpensive.getPrice() < list[i].getPrice()) {
                mostExpensive = list[i];
            }
        }
        return mostExpensive;
    }

}
