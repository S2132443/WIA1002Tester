package LabTest1;



public class Pet <T extends Comparable> implements Comparable<Pet<T>> {
    
    /* Create a class named “ShopLot”. It should have information including the shop name,
    contact person, and all employee’s detail.*/

    String breed;
    int weight;
    String sickness;

    public Pet(String breed, int weight, String sickness) {
        this.breed = breed;
        this.weight = weight;
        this.sickness = sickness;
    }
    
    @Override // Override the compareTo()method to compare the first values of two objects.
    public int compareTo(Pet<T> o) {
        return (this.breed).compareTo(o.breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }
    
    
    public String printBreed() {
        return "Breed: " + getBreed();
    }
    
    public String printWeight() {
        return "Weight: " + getWeight();
    }
    
    public String printSickness() {
        return "Sickness: " + getSickness();
    }

    
}
