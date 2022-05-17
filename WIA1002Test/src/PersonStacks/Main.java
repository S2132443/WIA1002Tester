package PersonStacks;

public class Main {
    public static void main(String[] args) {
        Stack raw = new Stack("Raw list");
        raw.push("ali", 32, "m", "doctor");
        raw.push("lisa", 29, "f", "nurse");
        raw.push("tanaka", 41);
        raw.push("ahmad", 18, "m", "developer");
        raw.push("maria", 20, "f", "accountant");
        raw.push("chong", 70, "m", "lawyer");
        raw.push("raju", 55, "m", "police");
        raw.push("alex", 16, "f", "business man ");
        Person katie = new Person("katie", 36, "f", "teacher");
        raw.push(katie);

        String part = "C";

        if (part.equals("A"))
            raw.displayStack();
        else if (part.equals("B")) {
            System.out.println("~~~~~~~Sort into frontliners and others~~~~~");

            Stack frontliners = new Stack("Frontliners");
            Stack others = new Stack("Others");

            while (raw.getSize() != 0) {
                Person aPerson = raw.pop();
                if (aPerson.isFrontliner())
                    frontliners.push(aPerson);
                else
                    others.push(aPerson);
            }

            raw.displayStack();

            System.out.println("\n-------------------\n");

            frontliners.displayStack();

            System.out.println("\n-------------------\n");
            
            others.displayStack();
        }
        else if (part.equals("C")) {
            Stack frontliners = new Stack("Frontliners");
            Stack others = new Stack("Others");

            while (raw.getSize() != 0) {
                Person aPerson = raw.pop();
                if (aPerson.isFrontliner())
                    frontliners.push(aPerson);
                else
                    others.push(aPerson);
            }

            frontliners = sortTheDamnStack(frontliners);
            others = sortTheDamnStack(others);

            Stack priority = new Stack("Vaccine Priority List");

            while (!others.isEmpty())
                priority.push(others.pop());
            
            while (!frontliners.isEmpty())
                priority.push(frontliners.pop());

            System.out.println("~~~~~~~Sort into Vaccine list~~~~~\n\n");

            others.displayStack();

            System.out.println("\n\n-------------------\n\n");

            frontliners.displayStack();

            System.out.println("\n\n-------------------\n\n");

            priority.displayStack();
        }

    }

    public static Stack sortTheDamnStack(Stack theStack) {
        Stack tmpStack = new Stack("This is a temporary stack, will be used as the intemediary when sorting does hummungus age");

        while (!theStack.isEmpty()) {
            Person tmpPerson = theStack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek().getAge() < tmpPerson.getAge()) {
                theStack.push(tmpStack.pop());
            }

            tmpStack.push(tmpPerson);
        }

        return tmpStack;
    }
}
