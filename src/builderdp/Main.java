
package builderdp;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        char choice;
   
        
        DentistBuilder db = new  DentistBuilder();
        
        do {
            // cls 

            System.out.print(  "**************************************************************************************\n"
                            +  "***********                Welcome to my Dentist Finder                 **************\n"
                            +  "*****  It helps you in adding, previewing data for general or specialist dentist *****\n"
                            +  "**************************************************************************************\n"
                            +  "\n\n"
                            +  "1. Add personalInfo\n"
                            +  "2. Add biographyInfo\n"
                            +  "3. Add addressInfo\n"
                            +  "4. Add educationInfo\n"
                            +  "5. Add specializationInfo\n"
                            +  "6. Preview what i add\n"
                            +  "7. Exit \n"
                            +  "\n\n"
                            +  " Enter your Choice : "
                            );             
                

            choice = scn.next().charAt(0);
            switch (choice) {

                case '1': {
                    
                    String firstName="", lastName="", emailAddress="", website="", phoneNumber="";
                    System.out.println("Enter your firstName : "); 
                    firstName=scn.next();
                    System.out.println("Enter your lastName : "); 
                    lastName=scn.next();
                    System.out.println("Enter your emailAddress : "); 
                    emailAddress=scn.next();
                    System.out.println("Enter your website : "); 
                    website=scn.next();
                    System.out.println("Enter your phoneNumber : "); 
                    phoneNumber=scn.next();
                    db.addPersonalInfo(new PersonalInformation(firstName, lastName, emailAddress, website, phoneNumber));
                    break;

                }
                case '2': {
                    
                    String licenseCountryName="", licenseNumber="", yearsInPractice="", gender="";
                    System.out.println("Enter your licenseCountryName : "); 
                    licenseCountryName=scn.next();
                    System.out.println("Enter your licenseNumber : "); 
                    licenseNumber=scn.next();
                    System.out.println("Enter your yearsInPractice : "); 
                    yearsInPractice=scn.next();
                    System.out.println("Enter your gender : "); 
                    gender=scn.next();
                    
                    db.addBiography(new Biography(licenseCountryName, licenseNumber, yearsInPractice, gender));
                    break;

                }
                case '3': {
                    
                    String country="", state="", city="", street="", postalCode="";
                    System.out.println("Enter your country : "); 
                    country=scn.next();
                    System.out.println("Enter your state : "); 
                    state=scn.next();
                    System.out.println("Enter your city : "); 
                    city=scn.next();
                    System.out.println("Enter your street : "); 
                    street=scn.next();
                    System.out.println("Enter your postalCode : "); 
                    postalCode=scn.next();
                    db.addAddress(new Address(country, state, city, street, postalCode));
                    break;

                }
                case '4': {
                    
                    String degree="", major="", school="", year="";
                    System.out.println("Enter your degree : "); 
                    degree=scn.next();
                    System.out.println("Enter your major : "); 
                    major=scn.next();
                    System.out.println("Enter your school : "); 
                    school=scn.next();
                    System.out.println("Enter your year : "); 
                    year=scn.next();
                    
                    db.addEducation(new Education(degree, major, school, year));  
                    break;

                }
                case '5': {
                    
                    String areaOfSpecialization="", year="";
                    System.out.println("Enter your areaOfSpecialization : "); 
                    areaOfSpecialization=scn.next();
                    System.out.println("Enter your year : "); 
                    year=scn.next();
                    db.addSpecialization(new Specialization(areaOfSpecialization, year));
                    break;

                }
                case '6': {
                    
                    Dentist den = db.build();
                    System.out.println("\n" + den);
                    System.out.println("Press any key to continue ..");
                    scn.next().charAt(0);
                    break;

                }
                case '7': {

                    System.exit(0);
                    break;

                }
                default: {

                    System.out.print(" The entered value is unrecognized! \n");
                    break;

                }
            }

        } while (true);   

    }

}
    

