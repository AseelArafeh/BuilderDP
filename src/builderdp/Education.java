
package builderdp;


public class Education {
    
    private String degree;
    private String major;
    private String school;
    private String year;

    public Education(String degree, String major, String school, String year) {
        this.degree = degree;
        this.major = major;
        this.school = school;
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "\n\tdegree: " + degree + "\n\tmajor: " + major + "\n\tschool: " + school + "\n\tyear: " + year ;

    }
    
    
    
   
}
