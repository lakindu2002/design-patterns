package builder;

public class CarBuilder extends VehicleBuilder{

    private Vehicle car;

    public CarBuilder() {
        this.car = new Car();
    }


    @Override
    public void addTyres() {
        System.out.println("Adding Car Tyres");
        car.setTyres("Adding tyres");
    }

    @Override
    public void addEngine() {
        System.out.println("Adding Car Engine");
        car.setEngine("Setting engine");
    }

    @Override
    public void addOuterFramework() {
        System.out.println("Adding Car Outer Framework");
        car.setOuterFramework("Setting outerframework");
    }

    @Override
    public void addChassy() {
        System.out.println("Adding Car Chassy");
        car.setChassy("Setting chassy");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("Returning the car");
        return this.car;
    }
}
