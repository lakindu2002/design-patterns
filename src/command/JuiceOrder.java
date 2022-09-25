package command;

public class JuiceOrder implements Order {

    private final Menu juiceMenu;

    public JuiceOrder(Menu juiceMenu) {
        this.juiceMenu = juiceMenu;
    }

    @Override
    public void execute() {
        this.juiceMenu.prepareMenu();
    }
}
