package command;

public class Waiter {

    private Order juiceOrder;
    private Order mealOrder;
    private Order dessertOrder;


    public void setOrder(Order juiceOrder, Order mealOrder, Order dessertOrder) {
        this.dessertOrder = dessertOrder;
        this.juiceOrder = juiceOrder;
        this.mealOrder = mealOrder;
    }

    public void selectMeal() {
        mealOrder.execute();
    }

    public void selectJuice() {
        juiceOrder.execute();
    }

    public void selectDessert() {
        dessertOrder.execute();
    }


}
