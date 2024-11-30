import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(12345, "Jhona Dow", "HAV1233","1234567890","jjcom@gmail.com"));
        users.add(new User(12346, "Michel Clark", "HFJV1233","9234326789","sssss@gmail.com"));
        users.add(new User(12347, "Usan Bolt", "PAV1233","1234567890","usan@gmail.com"));

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle(12345, "KA11JQ1234",VehicleType.CAR, "Mahindra", "Thar", "Black"));
        vehicles.add(new Vehicle(12346, "KA11JQ1235",VehicleType.CAR, "Tata", "Safari", "Red"));

        List<Store> stores = new ArrayList<Store>();
        stores.add(new Store(12345, new VehicleInventoryManagment(vehicles), new Location("Mangalore Zoom Park", "Bengaluru","Karnataka","560103","India",123444.8,1234567.9), new ArrayList<Reservation>()));

        //create dummy reservation
        Store store = stores.get(0);
        Reservation reservation = new Reservation(12345, users.get(0), vehicles.get(0), new Date().toString(), new Date().toString(), store.location, store.location, 1000.0);
        Bill bill = new Bill(reservation);
        Payment payment = new Payment(bill,100000);



    }
}