package builder;

public class BusBuilder extends VehicleBuilder {

    private Vehicle bus;

    @Override
    public void addTyres() {
        System.out.println("Adding Bus Tyres");
        bus.setTyres("Setting tyres");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding Bus Engine");
        bus.setEngine("Setting engine");
    }

    @Override
    public void addOuterFramework() {
        System.out.println("Adding Bus Outer Framework");
        bus.setOuterFramework("Setting outerframework");
    }

    public BusBuilder() {
        this.bus = new Bus();
    }

    @Override
    public void addChassy() {
        System.out.println("Adding Bus Chassy");
        bus.setChassy("Setting chassy");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("Returning the Bus");
        return this.bus;
    }
}
