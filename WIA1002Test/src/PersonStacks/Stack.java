package PersonStacks;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Person> list = new ArrayList<>();
    String stack_name;

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }

    public void push(String name, int age) {
        this.push(new Person(name, age));
    }

    public void push(String name, int age, String gender, String occupation) {
        this.push(new Person(name, age, gender, occupation));
    }

    public void push(Person o) {
        list.add(o);
    }

    public Person pop() {
        Person o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public Person peek() {
        return list.get(getSize() - 1);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder repr = new StringBuilder();

        repr.append(String.format("----%s----\n\n", this.stack_name));
        if (this.list.size() != 0){
            for (int i = this.list.size() - 1; i >= 0; i--) {
                Person thePerson = this.list.get(i);
                repr.append(
                        String.format("%d %s %d %s %s%s", i, thePerson.getName(), thePerson.getAge(), thePerson.getGender(),
                                thePerson.isFrontliner() ? "Frontliner" : "Not Frontliner", i == 0 ? "" : "\n\n"));
            }
        }
        else {
            repr.append("Empty Stack");
        }

        return repr.toString();
    }

    public boolean search(Person o) {
        return list.contains(o);
    }

    public void displayStack() {
        System.out.println(this.toString());
    }
}