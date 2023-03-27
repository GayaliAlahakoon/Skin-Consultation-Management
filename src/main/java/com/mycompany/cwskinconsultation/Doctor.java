
package com.mycompany.cwskinconsultation;
import java.util.ArrayList;

public class Doctor extends Person {
     static ArrayList<Doctor> doctors = new ArrayList<>();

     static ArrayList<Doctor> temporaryDoctors = new ArrayList<>();
    
    private int medicalLicenceNo;
    private String specialisation;

    public Doctor(int medicalLicenceNumber, String specialisation,
            String name, String surName, String dateOfBirth, int mobileNumber) {
        
        //calling the parent's constructor
        super(name, surName, dateOfBirth, mobileNumber);
        this.medicalLicenceNo = medicalLicenceNumber;
        this.specialisation = specialisation;
    }
    
    //getters

    public int getMedicalLicenceNo() {
        return medicalLicenceNo;
    }

    public String getSpecialisation() {
        return specialisation;
    }
    
    //setters

    public void setMedicalLicenceNo(int medicalLicenceNo) {
        this.medicalLicenceNo = medicalLicenceNo;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
    
    
}

