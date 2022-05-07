package LabTest1FarisAnswer;

public class Cat extends Pet{
    private String name = "";

    public Cat(String breed, String sickness, Integer weight, String name) {
        super(breed, sickness, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { //simlpify printing out process
        return "Name: " + name + "\n" +
                "Breed: " + getBreed() + "\n" +
                "Weight (KG): " + getWeight() + "\n" +
                "Sickness: " + getSickness() + "\n";
    }
}