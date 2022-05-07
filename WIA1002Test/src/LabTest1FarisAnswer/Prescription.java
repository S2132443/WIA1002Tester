package LabTest1FarisAnswer;

public class Prescription <T extends Cat>{
    private Pet pet;
    private String medication;
    private Integer dosage;

    Prescription(Pet pet, String medication, Integer dosage){
        this.pet = pet;
        this.medication = medication;
        this.dosage = dosage;
    }

    @Override
    public String toString() { // simplify printing out process
        return "Medication: " + getMedication() + "\n" +
                "Dosage (ml): " + getDosage();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }
}