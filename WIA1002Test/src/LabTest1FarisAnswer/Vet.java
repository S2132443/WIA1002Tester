/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1FarisAnswer;

import java.util.ArrayList;

public class Vet {
    private String name, qualification;

    public Vet(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public void giveTreatment(ArrayList<Prescription> prescriptions){
        System.out.println("Prescriptions are: ");
        for (Prescription prescription : prescriptions) {
            System.out.print(prescription);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}