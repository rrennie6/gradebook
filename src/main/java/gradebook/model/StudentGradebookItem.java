package gradebook.model;

public class StudentGradebookItem {
	
	private Student student;
	private GradebookItem GradeItem;
	private int score;
	
	public StudentGradebookItem(Student student, GradebookItem GradeItem){
		this.student = student;
		this.GradeItem = GradeItem;
	}
	
	public StudentGradebookItem(Student student, int score, GradebookItem GradeItem){
		this.student = student;
		this.GradeItem = GradeItem;
		this.score = score;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
	
	public Student getStudent(){
		return student;
	}
	public GradebookItem getGradeItem(){
		return GradeItem;
	}
}
