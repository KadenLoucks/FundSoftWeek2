package student;

/**
 *
 * @author Kaden 2020-01-24
 */
public class partTimeStudent extends Student{
    
    private int hoursOfStudy;

    public partTimeStudent(String givenName, String givenID) {
        super(givenName, givenID);
    }
    
    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    public void setHoursOfStudy(int hoursOfStudy) {
        this.hoursOfStudy = hoursOfStudy;
    }
}
