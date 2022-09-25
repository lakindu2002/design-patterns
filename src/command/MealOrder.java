package command;

public class MealOrder implements Order {

    private final Menu mealMenu;

    public MealOrder(Menu mealMenu) {
        this.mealMenu = mealMenu;
    }

    @Override
    public void execute() {
        this.mealMenu.prepareMenu();
    }
}
