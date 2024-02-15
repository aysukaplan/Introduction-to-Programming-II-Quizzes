public class Seat {
    private int seat_id;
    private boolean status;
    private Passenger passenger;

    public Seat(int seat_id, boolean status, Passenger passenger) {
        this.seat_id = seat_id;
        this.status = false;
        this.passenger = passenger;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public void display(){
        System.out.println("Seat id: " + seat_id);
        System.out.println("Seat status: " + status);
        System.out.println("Name: " + passenger.getName());
        System.out.println("Surname: " + passenger.getSurname());
        System.out.println("Gender: " + passenger.getGender());
        System.out.println("Country Code: " + passenger.getPhone().getCountryCode());
        System.out.println("Area Code: " + passenger.getPhone().getCode());
        System.out.println("Number: " + passenger.getPhone().getNumber());
        System.out.println("Type: " + passenger.getPhone().getType());
    }
}
