
package builderdp;


public class Specialization {
    private String areaOfSpecialization;
    private String year;

    public Specialization(String areaOfSpecialization, String year) {
        this.areaOfSpecialization = areaOfSpecialization;
        this.year = year;
    }

    public String getAreaOfSpecialization() {
        return areaOfSpecialization;
    }

    public void setAreaOfSpecialization(String areaOfSpecialization) {
        this.areaOfSpecialization = areaOfSpecialization;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Specialization{" + "areaOfSpecialization=" + areaOfSpecialization + ", year=" + year + '}';
    }

    
    
}
