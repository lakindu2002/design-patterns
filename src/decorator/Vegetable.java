package decorator;

public class Vegetable extends MealDecarator {
    private Meal meal;

    public Vegetable(Meal meal) {
        this.meal = meal;
    }

    @Override
    public double cost() {
        return meal.cost() + 20;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + ", Vegetable";
    }
}
