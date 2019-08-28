
package builderdp;

import java.util.ArrayList;


public class Dentist {
    
    private PersonalInformation personalInfo;
    private Biography biographyInfo;   
    private ArrayList<Education> educationInfo = new ArrayList<>();
    private ArrayList<Address> addressInfo = new ArrayList<>(); 
    private ArrayList<Specialization> specializationInfo = new ArrayList<>(); 
 
    Dentist(DentistBuilder builder) {
        this.personalInfo = builder.personalInfo;
        this.biographyInfo = builder.biographyInfo;
        this.educationInfo = builder.educationInfo;
        this.addressInfo = builder.addressInfo;
        this.specializationInfo = builder.specializationInfo;
    }
 
    //All getter, and NO setter to provde immutability
    public PersonalInformation getPersonalInfo() {
        return personalInfo;
    }
    public Biography getBiographyInfo() {
        return biographyInfo;
    }
    public ArrayList<Education> getEducationInfo() {
        return educationInfo;
    }
    public ArrayList<Address> getAddressInfo() {
        return addressInfo;
    }
    public ArrayList<Specialization> getSpecializationInfo() {
        return specializationInfo;
    }
 
    @Override
    public String toString() {
        return "Dentist: "+this.personalInfo+", "+this.biographyInfo+", "+this.educationInfo+", "+this.addressInfo+", "+this.specializationInfo;
    }
 
    
}