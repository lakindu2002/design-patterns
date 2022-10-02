package template;

public class Coffee extends Beverages {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Coffee Condiments");
    }
}
