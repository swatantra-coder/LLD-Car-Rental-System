import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagment {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    //all crud operationS

    VehicleInventoryManagment(List<Vehicle> vh){
        this.vehicles = vh;
    }

    //getter setter
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
