package template;

public class Test {
    public static void main(String[] args) {
        Beverages tea = new Tea();
        tea.prepareRecipe();
        System.out.println("------------");
        Beverages coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
