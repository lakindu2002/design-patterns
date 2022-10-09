package decorator;

public class Rice extends Meal {
    public Rice() {
        super.setDescription("Rice");
    }

    @Override
    public double cost() {
        return 100;
    }
}
