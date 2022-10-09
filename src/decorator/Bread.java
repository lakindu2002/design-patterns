package decorator;

public class Bread extends Meal {
    public Bread() {
        super.setDescription("Bread");
    }
    @Override
    public double cost() {
        return 80;
    }
}
