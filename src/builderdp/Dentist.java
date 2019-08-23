
package builderdp;


public class Dentist {
    
    //All final attributes
    private final PersonalInformation personalInfo; // required
    private final Biography biographyInfo; // required
    private final Education educationInfo; // required
    private final Address addressInfo; // required
    private final Specialization specializationInfo; // optional
 
    private Dentist(DentistBuilder builder) {
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
    public Education getEducationInfo() {
        return educationInfo;
    }
    public Address getAddressInfo() {
        return addressInfo;
    }
    public Specialization getSpecializationInfo() {
        return specializationInfo;
    }
 
    @Override
    public String toString() {
        return "Dentist: "+this.personalInfo+", "+this.biographyInfo+", "+this.educationInfo+", "+this.addressInfo+", "+this.specializationInfo;
    }
 
    public static class DentistBuilder {
        
        private final PersonalInformation personalInfo;
        private final Biography biographyInfo;
        private final Education educationInfo;
        private final Address addressInfo;
        private Specialization specializationInfo;
 
        public DentistBuilder(PersonalInformation personalInfo, Biography biographyInfo, Education educationInfo, Address addressInfo) {
            this.personalInfo = personalInfo;
            this.biographyInfo = biographyInfo;
            this.educationInfo = educationInfo;
            this.addressInfo = addressInfo;
        }
        
        public DentistBuilder specializationBuilder(Specialization specializationInfo) {
            this.specializationInfo = specializationInfo;
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
    
}