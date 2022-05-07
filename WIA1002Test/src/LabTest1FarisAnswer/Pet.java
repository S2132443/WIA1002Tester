package LabTest1FarisAnswer;

public class Pet implements Comparable<Pet>{
    private String breed, sickness;
    private Integer weight;

    public Pet(String breed, String sickness, Integer weight) {
        this.breed = breed;
        this.sickness = sickness;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pet o) {
        return Integer.compare(this.weight, o.getWeight()); // returns a negative integer if this.weight is less than o.getWeight.
                                                           // returns 0 if theyre both equal.
                                                           // returns a positive integer if this.weight is more than o.getWeight.
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}


