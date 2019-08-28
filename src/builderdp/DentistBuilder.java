
package builderdp;

import java.util.ArrayList;


public class DentistBuilder {
        
        PersonalInformation personalInfo;
        Biography biographyInfo;   
        ArrayList<Education> educationInfo = new ArrayList<>();
        ArrayList<Address> addressInfo = new ArrayList<>(); 
        ArrayList<Specialization> specializationInfo = new ArrayList<>(); 
        
        
        public DentistBuilder() {
            /*this.personalInfo = personalInfo;
            this.biographyInfo = biographyInfo;
            this.educationInfo.add(educationInfo);
            this.addressInfo.add(addressInfo);*/
        }
        public DentistBuilder addPersonalInfo(PersonalInformation personalInfo) {
            this.personalInfo= personalInfo;
            return this;
        }
        
        public DentistBuilder addBiography(Biography biographyInfo) {
            this.biographyInfo=biographyInfo;
            return this;
        }
        
        public DentistBuilder addEducation(Education educationInfo) {
            this.educationInfo.add(educationInfo);
            return this;
        }
        
        public DentistBuilder addAddress(Address addressInfo) {
            this.addressInfo.add(addressInfo);
            return this;
        }
        
        public DentistBuilder addSpecialization(Specialization specializationInfo) {
            this.specializationInfo.add(specializationInfo);
            return this;
        }
        
        //Return the finally consrcuted Dentist object
        public Dentist build() {
            Dentist dentist =  new Dentist(this);
            validateUserObject(dentist);
            return dentist;
        }
        
        private void validateUserObject(Dentist dentist) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
        
    }
    
