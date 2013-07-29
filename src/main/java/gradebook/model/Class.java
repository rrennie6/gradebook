package gradebook.model;
import java.util.ArrayList;

public class Class{

	private Course course;
	private ArrayList<Section> sections;
	private String semester;
	private int year;
	
	public Class(Course course){
		this(course, 0000, "unentered semester", new ArrayList<Section>());
	}
	public Class(Course course, String semester){
		this(course, 0000, semester, new ArrayList<Section>());
	}
	public Class(Course course, int year, String semester){
		this(course, year, semester, new ArrayList<Section>());
	}
	public Class(Course course, String semester, ArrayList<Section> sections){
		this(course, 0000, semester, sections);
	}
	public Class(Course course, int year, String semester, ArrayList<Section> sections){
		this.course = course;
		this.year = year;
		this.semester = semester;
		this.sections = sections;
	}
	
	public Course getCourse(){
		return course;
	}
	public String getSemester(){
		return semester;
	}
	public int getYear(){
		return year;
	}
	
	public ArrayList<Section> getSections(){
		return sections;
	}
	
	public void addSection(Section newSection){
		sections.add(newSection);
	}
}
