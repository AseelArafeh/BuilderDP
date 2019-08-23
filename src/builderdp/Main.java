
package builderdp;


public class Main {

    public static void main(String[] args) {
        
        PersonalInformation personalInfo = new PersonalInformation("Aseel", "Arafeh", "arafehaseel@gmail.com", "aseel.com", "0598000000"); // required
        Biography biographyInfo = new Biography("licenseCountryName", "licenseNumber", 2019, "gender"); // required
        Education educationInfo = new Education("degree", "major", "school", 2019); // required
        Address addressInfo= new Address("country", "state", "city", "street", 10); // required
        Specialization specializationInfo = new Specialization("areaOfSpecialization", 2019); // optional
        
        // For Building "General Dentist Type"
        Dentist generalDentist = new Dentist.DentistBuilder(personalInfo, biographyInfo, educationInfo, addressInfo)
                                            .build();
 
        System.out.println(generalDentist);
        
        
        // For Building "Specialist Dentist Type"
        Dentist specialistDentist = new Dentist.DentistBuilder(personalInfo, biographyInfo, educationInfo, addressInfo)
                                               .specializationBuilder(specializationInfo)
                                               .build();
        
        System.out.println(specialistDentist);
        

    }
    
}
