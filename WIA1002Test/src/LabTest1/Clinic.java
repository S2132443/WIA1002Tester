package LabTest1;





public class Clinic {
    
    String clinicName;
    
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Dimmy","Siamese",5,"Diarrhea");
        Cat cat2 = new Cat("Tabby","British Shorthair",6,"Worms");
        
       

        System.out.println(cat1.printName()+ "\n" + cat1.printBreed()+ "\n" + cat1.printWeight()+ "\n" + cat1.printSickness() + "\n");
        System.out.println(cat2.printName()+ "\n" + cat2.printBreed()+ "\n" + cat2.printWeight()+ "\n" + cat2.printSickness() + "\n");
        

        System.out.println("Food store with highest number of employees: " + highest(cat1,cat2));
        System.out.println("Fashion store with highest number of employees: " + highest(cat1,cat2));

        String highest;
        if (cat1.compareTo(cat2) > 0) {
            highest = cat1.getName();
        } else {
            highest = cat2.getName();
        }

        
        
    }

    public static <T extends Pet> T highest(T cat1, T cat2) {
        if (cat1.getWeight() > cat2.getWeight()) {
            return cat1;
        } else {
            return cat2;
        }
    }

  

}
