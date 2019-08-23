
package builderdp;


public class Biography {
    
    private String licenseCountryName;
    private String licenseNumber;
    private int yearsInPractice;
    private String gender;

    public Biography(String licenseCountryName, String licenseNumber, int yearsInPractice, String gender) {
        this.licenseCountryName = licenseCountryName;
        this.licenseNumber = licenseNumber;
        this.yearsInPractice = yearsInPractice;
        this.gender = gender;
    }

    public String getLicenseCountryName() {
        return licenseCountryName;
    }

    public void setLicenseCountryName(String licenseCountryName) {
        this.licenseCountryName = licenseCountryName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearsInPractice() {
        return yearsInPractice;
    }

    public void setYearsInPractice(int yearsInPractice) {
        this.yearsInPractice = yearsInPractice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Biography{" + "licenseCountryName=" + licenseCountryName + ", licenseNumber=" + licenseNumber + ", yearsInPractice=" + yearsInPractice + ", gender=" + gender + '}';
    }
    
}
