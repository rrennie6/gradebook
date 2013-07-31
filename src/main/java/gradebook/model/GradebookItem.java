package gradebook.model;
/**
 * creates a gradebook item that knows what
 * category it is in
 * @author Rex
 *
 */
public class GradebookItem {

	private String name;
	private GradebookCategory category;

	public GradebookItem(String name, GradebookCategory category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public GradebookCategory getCategory() {
		return category;
	}
}
