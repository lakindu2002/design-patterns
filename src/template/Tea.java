package template;

public class Tea extends Beverages {
    @Override
    public void brew() {
        System.out.println("Brewing Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Tea Condiments");
    }
}
