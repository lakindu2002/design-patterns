package builder;

public class CarBuilder extends VehicleBuilder{
    @Override
    public void addTyres() {
        System.out.println("Adding Car Tyres");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding Car Engine");
    }

    @Override
    public void addOuterFramework() {
        System.out.println("Adding Car Outer Framework");
    }

    @Override
    public void addChassy() {
        System.out.println("Adding Car Chassy");
    }
}
