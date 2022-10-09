package decorator;

public class Egg extends MealDecarator {

    private Meal meal;

    public Egg(Meal meal) {
        this.meal = meal;
    }

    @Override
    public double cost() {
        return meal.cost() + 30;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + ", Egg";
    }
}
