package decorator;

public class Test {
    public static void main(String[] args) {
        Meal meal = new Noodles();
        meal = new Chicken(meal);
        meal = new Fish(meal);
        meal = new Egg(meal);
        meal = new Vegetable(meal);

        System.out.println(meal.getDescription() + " => Rs. " + meal.cost());

        Meal meal2 = new Chicken(new Fish(new Egg(new Vegetable(new Bread()))));
        System.out.println(meal2.getDescription() + " => Rs. " + meal2.cost());

        Meal meal3 = new Fish(new Chicken(new Vegetable(new Egg(new Rice()))));
        System.out.println(meal3.getDescription() + " => Rs. " + meal3.cost());

        String description = new Egg(new Chicken(new Fish(new Noodles()))).getDescription();
        double price = new Egg(new Chicken(new Fish(new Noodles()))).cost();

        System.out.println(description + " => Rs. " + price);
    }
}
