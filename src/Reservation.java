public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    String reservationDate;
    String returnDate;
    Location pickupLocation;
    Location returnLocation;
    double totalCost;

    public Reservation(int reservationId, User user, Vehicle vehicle, String reservationDate, String returnDate, Location pickupLocation, Location returnLocation, double totalCost) {
        this.reservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
        this.reservationDate = reservationDate;
        this.returnDate = returnDate;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;
        this.totalCost = totalCost;
    }

    //CRUD operations

    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("User ID: " + user.userId);
        System.out.println("Vehicle ID: " + vehicle.id);
        System.out.println("Reservation Date: " + reservationDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Pickup Location: " + pickupLocation.address + ", " + pickupLocation.city + ", " + pickupLocation.state + ", " + pickupLocation.zipCode + ", " + pickupLocation.country);
        System.out.println("Return Location: " + returnLocation.address + ", " + returnLocation.city + ", " + returnLocation.state + ", " + returnLocation.zipCode + ", " + returnLocation.country);
        System.out.println("Total Cost: " + totalCost);
    }

}
