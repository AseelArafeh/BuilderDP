
package builderdp;

import java.util.ArrayList;


public class Dentist {
    
    private PersonalInformation personalInfo; // required
    private Biography biographyInfo; // required
    private ArrayList<Education> educationInfo; // required
    private ArrayList<Address> addressInfo; // required
    private ArrayList<Specialization> specializationInfo; // optional
    /// two array list in 20-23 line ?
 
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
        String str="";
        if(personalInfo!=null)str+= "Your Personal Information:\n"+personalInfo+"\n";
        else str+="Your Personal Information: ---\n";
        
        if(biographyInfo!=null)str+= "Your Biography Information:\n"+biographyInfo+"\n";
        else str+="Your Biography Information: ---\n";
        //        return  "\tfirstName : " + firstName + "\n\tlastName=" + lastName + "\n\temailAddress=" + emailAddress + "\n\twebsite=" + website + "\n\tphoneNumber=" + phoneNumber + "\n\n";

        if(educationInfo!=null) {
            str+="Your Eucation Information:\n";
            for(int i=0;i<educationInfo.size();i++)str+=educationInfo.get(i)+"\n\t------------------------------\n";
            str+="\n";
        } else str+="Your Eucation Information: ---\n";
        
        if(addressInfo!=null) {
            str+="Your Address Information:\n";
            for(int i=0;i<addressInfo.size();i++)str+=addressInfo.get(i)+"\n\t------------------------------\n";
            str+="\n";
        } else str+="Your Address Information: ---\n";
        
        if(specializationInfo!=null) {
            str+="Your Specialization Information:\n";
            for(int i=0;i<specializationInfo.size();i++)str+=specializationInfo.get(i)+"\n\t------------------------------\n";
            str+="\n";
        } else str+="Your Specialization Information: ---\n";
        
        return str;
    }
 
    
}