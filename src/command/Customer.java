package command;

public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        Menu dessertMenu = new DessertMenu();
        Menu juiceMenu = new JuiceMenu();
        Menu mealMenu = new MealMenu();

        Order juiceOrder = new JuiceOrder(juiceMenu);
        Order dessertOrder = new JuiceOrder(dessertMenu);
        Order mealOrder = new JuiceOrder(mealMenu);

        waiter.setOrder(juiceOrder, mealOrder, dessertOrder);

        waiter.selectDessert();
        waiter.selectJuice();
        waiter.selectMeal();
    }
}
