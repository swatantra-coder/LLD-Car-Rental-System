public class Bill {
    Reservation reservation;
    boolean isPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
    }

}
