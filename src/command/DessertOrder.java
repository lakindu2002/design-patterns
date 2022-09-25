package command;

public class DessertOrder implements Order {

    private final Menu dessertMenu;

    public DessertOrder(Menu dessertMenu) {
        this.dessertMenu = dessertMenu;
    }

    @Override
    public void execute() {
        this.dessertMenu.prepareMenu();
    }
}
