
package builderdp;


public class Education {
    
    private String degree;
    private String major;
    private String school;
    private int year;

    public Education(String degree, String major, String school, int year) {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Education{" + "degree=" + degree + ", major=" + major + ", school=" + school + ", year=" + year + '}';
    }
    
    
    
   
}
