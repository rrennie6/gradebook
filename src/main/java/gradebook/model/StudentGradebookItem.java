package gradebook.model;
/**
 * creates specific graded works that know which item
 * they are and what student they belong to
 * @author Rex
 *
 */
public class StudentGradebookItem {

    private Student student;
    private GradebookItem gradeItem;
    private int score;

    public StudentGradebookItem(Student student, GradebookItem gradeItem) {
        this.student = student;
        this.gradeItem = gradeItem;
    }

    public StudentGradebookItem(Student student,
                                int score, GradebookItem gradeItem) {
        this.student = student;
        this.gradeItem = gradeItem;
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public Student getStudent() {
        return student;
    }
    public GradebookItem getGradeItem() {
        return gradeItem;
    }
}
