package student;

/**
 * A class to model students.
 * Students can study. They have a 
 * name and id
 *
 * @author Kaden Beka Loucks
 */
public class Student {
   // adding this change for a edit
   // second comment for edit
    private String name;
    private String studentID;
    private String program;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    /**
     * a constructor that takes in both parameters 
     * @param givenName - the students name
     * @param givenID - the students ID
     */
    
    public Student(String givenName, String givenID){
        name = givenName;
        studentID = givenID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    /**
     * a method that returns true if a student 
     * studied and false otherwise
     * @return whether or not the student study
     */
    
    public boolean didstudy(){
        return true;
    }// end boolean

}// end class
