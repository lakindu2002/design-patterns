package builder;

public class BusBuilder extends VehicleBuilder{
    @Override
    public void addTyres() {
        System.out.println("Adding Bus Tyres");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding Bus Engine");
    }

    @Override
    public void addOuterFramework() {
        System.out.println("Adding Bus Outer Framework");
    }

    @Override
    public void addChassy() {
        System.out.println("Adding Bus Chassy");
    }
}
