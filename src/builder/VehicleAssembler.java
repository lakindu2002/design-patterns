package builder;

public class VehicleAssembler {
    private VehicleBuilder builder;

    public VehicleAssembler(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void assembleVehicle() {
        this.builder.addChassy();
        this.builder.addEngine();
        this.builder.addEngine();
        this.builder.addOuterFramework();
    }

    public void getVehicle(){
        this.builder.getVehicle();
    }
}
