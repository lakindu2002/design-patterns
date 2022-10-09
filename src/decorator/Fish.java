package decorator;

public class Fish extends MealDecarator {
    private Meal meal;

    public Fish(Meal meal) {
        this.meal = meal;
    }

    @Override
    public double cost() {
        return meal.cost() + 40;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + ", Fish";
    }
}
