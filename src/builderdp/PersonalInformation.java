
package builderdp;


public class PersonalInformation {
    
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String website;
    private String phoneNumber;

    public PersonalInformation(String firstName, String lastName, String emailAddress, String website, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.website = website;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" + "firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + ", website=" + website + ", phoneNumber=" + phoneNumber + '}';
    }

    
    
}
