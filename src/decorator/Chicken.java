package decorator;

public class Chicken extends MealDecarator {
    private Meal meal;

    public Chicken(Meal meal) {
        this.meal = meal;
    }

    @Override
    public double cost() {
        return meal.cost() + 50;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + ", Chicken";
    }
}
