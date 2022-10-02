package template;

public abstract class Beverages {
    public abstract void brew();
    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling Water");
    }

    public void pourInCup(){
        System.out.println("Pour In Cup");
    }

    public final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
}
