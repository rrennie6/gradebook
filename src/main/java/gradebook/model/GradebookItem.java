package gradebook.model;

public class GradebookItem {
	
	private String name;
	private GradebookCategory category;
	
	public GradebookItem(String name, GradebookCategory category){
		this.name = name;
		this.category = category;
	}
	
	public String getName(){
		return name;
	}

	public GradebookCategory getCategory(){
		return category;
	}
}
