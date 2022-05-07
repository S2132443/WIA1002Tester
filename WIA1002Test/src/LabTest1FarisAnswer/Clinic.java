package LabTest1FarisAnswer;

import java.util.ArrayList;

public class Clinic {
    private String nameOfClinic;
    private Vet practitioner;

    public Clinic(String nameOfClinic, String name, String qualification) {
        this.nameOfClinic = nameOfClinic;
        this.practitioner = new Vet(name, qualification);
    }

    public static void main(String[] args) {
        Clinic clinic = new Clinic("Happy Animal Clinic", "Abu Bakar", "DVM(India)");
        Cat catDimmy = new Cat("Siamese", "Diarrhea", 5, "Dimmy");
        Cat catTabby = new Cat("British Shorthair", "Worms", 6, "Tabby");

        ArrayList<Prescription> prescriptions = new ArrayList<>();
        prescriptions.add(new Prescription(catDimmy, "Tylosin", 5));
        prescriptions.add(new Prescription(catTabby, "Pyrantel", 3));
        //a

        System.out.print("Clinic: " + clinic.getNameOfClinic());
        System.out.println("\nVet on Duty: " + clinic.getPractitioner().getName() + ", " + clinic.getPractitioner().getQualification() + "\n");
        System.out.println("Prescription Note");
        System.out.println(catTabby + "" + prescriptions.get(0) + "\n");
        System.out.println(catDimmy + "" + prescriptions.get(1));

        System.out.print("\nWeight Analysis: ");
        int weightTemp = catTabby.compareTo(catDimmy);
        if(weightTemp < 0){
            System.out.println("" + catDimmy.getName() + " is lighter than " + catTabby.getName());
        }else{
            System.out.println("" + catTabby.getName() + " is heavier than " + catDimmy.getName());
        }
    }

    public Vet getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(Vet practitioner) {
        this.practitioner = practitioner;
    }

    public String getNameOfClinic() {
        return nameOfClinic;
    }

    public void setNameOfClinic(String nameOfClinic) {
        this.nameOfClinic = nameOfClinic;
    }
}