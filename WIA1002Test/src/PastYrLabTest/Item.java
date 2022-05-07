package PastYrLabTest;

public class Item<T extends String> {

    T item;
    double price;

    public Item(T item, double price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return item.toString();
    }
}
