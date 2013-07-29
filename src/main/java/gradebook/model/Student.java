package gradebook.model;

public class Student {
	
	private String name;
	private int STID;
	
	public Student(String name, int STID){
		this.name = name;
		this.STID = STID;
	}
	public String getName(){
		return name;
	}
	public int getSTID(){
		return STID;
	}
}
