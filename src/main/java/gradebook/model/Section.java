package gradebook.model;
import java.util.ArrayList;

/**
 * creates a section of a course that holds all of
 * its students and graded works
 * @author Rex
 *
 */
public class Section {

    private String instructor;
    private int number;
    private ArrayList<Student> students;
    private ArrayList<StudentGradebookItem> gradedWork;

    public Section(Designate designation) {
        this.instructor = designation.getInstructor();
        this.number = designation.getSectionNumber();
        gradedWork = new ArrayList<StudentGradebookItem>();
        students = new ArrayList<Student>();
    }

    public int getSectionNumber() {
        return number;
    }

    public String getInstructor() {
        return instructor;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<StudentGradebookItem> getGradedWork() {
        return gradedWork;
    }

    public void addAssignment(StudentGradebookItem newItem) {
        gradedWork.add(newItem);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
