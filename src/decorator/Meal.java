package decorator;

public abstract class Meal {
    private String description = "Meal";

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
