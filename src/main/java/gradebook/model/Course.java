package gradebook.model;
import java.util.ArrayList;

/**
 * Creates a course that can be offered that has
 * a subject, number, name, and prerequisites
 * @author Rex
 *
 */
public class Course {

	private String subject;
	private int number;
	private String name;
	private ArrayList<Course> prereqs;
	
	public Course(String subject, int number, String name){
		this(subject, number, name, new ArrayList<Course>());
	}
	
	public Course(String subject, int number, String name, 
				  ArrayList<Course> prereqs){
		this.subject = subject;
		this.number = number;
		this.name = name;
		this.prereqs = prereqs;
	}
	
	public void addPrereq(Course newCourse){
		prereqs.add(newCourse);
	}
	
	public String getSubject(){
		return subject;
	}
	public int getNumber(){
		return number;
	}
	public String getName(){
		return name;
	}
	
	public ArrayList<Course> getPrereqs(){
		return prereqs;
	}
	
	public void setPrereqs(ArrayList<Course> prereqs){
		this.prereqs = prereqs;
	}
}
