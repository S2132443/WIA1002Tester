package PersonStacks;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private static final String[] occupation_list = { "doctor", "nurse", "teacher", "police" };
    private boolean frontliner;

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.setFrontliner();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.setFrontliner();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static String[] getOccupationList() {
        return occupation_list;
    }

    public boolean isFrontliner() {
        return frontliner;
    }

    public void setfrontliner(boolean frontliner) {
        this.frontliner = frontliner;
    }

    public void setFrontliner() {
        if (Arrays.asList(Person.occupation_list).contains(this.occupation))
            this.frontliner = true;
        else
            this.frontliner = false;
    }

}
