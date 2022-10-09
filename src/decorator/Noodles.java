package decorator;

public class Noodles extends Meal {
    public Noodles() {
        super.setDescription("Noodles");
    }
    @Override
    public double cost() {
        return 90;
    }
}
