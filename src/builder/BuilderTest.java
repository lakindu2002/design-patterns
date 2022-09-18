package builder;

public class BuilderTest {
    public static void main(String[] args) {
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleAssembler carAssembler = new VehicleAssembler(carBuilder);
        carAssembler.assembleVehicle();
        System.out.println(carAssembler.getVehicle().getChassy());
        System.out.println("------------");
        VehicleBuilder busBuilder = new BusBuilder();
        VehicleAssembler busAssembler = new VehicleAssembler(busBuilder);
        busAssembler.assembleVehicle();
        System.out.println(busAssembler.getVehicle().getChassy());
    }
}
