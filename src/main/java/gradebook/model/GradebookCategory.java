package gradebook.model;
/**
 * Creates a category for a grade book with a
 * weight
 * @author Rex
 *
 */
public class GradebookCategory {

    private String name;
    private int weight;
    private final int startingWeight = 20;

    public GradebookCategory(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public GradebookCategory(String name) {
        this.name = name;
        this.weight = startingWeight;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
}
