package builder;

public abstract class VehicleBuilder {
    public abstract void addTyres();
    public abstract void addEngine();
    public abstract void addOuterFramework();
    public abstract void addChassy();
    public abstract Vehicle getVehicle();
}
