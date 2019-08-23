
package builderdp;


public class Specialization {
    private String areaOfSpecialization;
    private int year;

    public Specialization(String areaOfSpecialization, int year) {
        this.areaOfSpecialization = areaOfSpecialization;
        this.year = year;
    }

    public String getAreaOfSpecialization() {
        return areaOfSpecialization;
    }

    public void setAreaOfSpecialization(String areaOfSpecialization) {
        this.areaOfSpecialization = areaOfSpecialization;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Specialization{" + "areaOfSpecialization=" + areaOfSpecialization + ", year=" + year + '}';
    }

    
    
}
