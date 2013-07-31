package gradebook.model;
/**
 * a student with a name and STID
 * @author Rex
 *
 */
public class Student {

    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public int getstudentID() {
        return studentID;
    }
}
