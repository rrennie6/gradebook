package gradebook.model;

/**
 * creates a placeholder for section number and 
 * instructor to be placed in a section. The 
 * static counter is helpful.
 * @author Rex
 *
 */
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
