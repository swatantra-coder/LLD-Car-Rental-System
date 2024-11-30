import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagment vn;
    Location location;
    List<Reservation> reservations;

    public Store(int i, VehicleInventoryManagment vehicleInventoryManagment, Location location, ArrayList<Reservation> reservations) {
        this.storeId = i;
        this.vn = vehicleInventoryManagment;
        this.location = location;
        this.reservations = reservations;
    }

    public void createReservation(Reservation reservation){
        reservations.add(reservation);
    }
}
