package gradebook.model;

public class Designate {
	
	private static int sectionNumber = 0;
	private String instructor;
	
	public Designate(String instructor){
		this.instructor = instructor;
		sectionNumber++;
	}
	
	public String getInstructor(){
		return instructor;
	}
	
	public int getSectionNumber(){
		return sectionNumber;
	}
}
