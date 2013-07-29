package gradebook.model;

public class GradebookCategory {
	
	private String name;
	private int weight;
	
	public GradebookCategory(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	public GradebookCategory(String name){
		this(name, 20);
	}
	
	public String getName(){
		return name;
	}
	public int getWeight(){
		return weight;
	}
}
