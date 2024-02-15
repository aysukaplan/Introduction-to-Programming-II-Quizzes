import java.util.ArrayList;

public class Bus {
    private String plate;
    private int seatCount;
    public ArrayList<Seat> seats = new ArrayList<>();

    public Bus(String plate, int seatCount) {
        this.plate = plate;
        this.seatCount = seatCount;

    }
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    public void bookSeat(Passenger p, int seatID){
        //If you try to book a seat that is already reserved,
        // you need to give an error message: and proceed booking with new seatid
        System.out.printf(String.valueOf(seats.size()));
        if(seats.size()==0){
            Seat s = new Seat(seatID,true,p);
            seats.add(s);
        }
        else{
            for(Seat s : seats){
                if(s.getSeat_id()==seatID){
                    if(s.getStatus()==false){
                        s.setPassenger(p);
                        s.setStatus(true);
                    }
                    else{
                        System.out.println("The seat has already reserved!");
                    }
                }
            }
        }
    }
    public void CancelBooking(int seatID){
        ArrayList<Integer> remove_indexes = new ArrayList<>();
        ArrayList<Seat> seats_copy = new ArrayList<>();
        for(Seat s : seats){
            if(s.getSeat_id()==seatID){
                remove_indexes.add(seats.indexOf(s));
            }
        }
        for(int i=0;i<seats.size();i++){
            if(!remove_indexes.contains(i)){
                seats_copy.add(seats.get(i));
            }
        }
        seats=seats_copy;

    }


    public void printAllPassengers(){
        for(Seat s : seats){
            Passenger p= s.getPassenger();
            p.display();
        }
    }
    public void printAllAvailableSeatIDs(){
        System.out.println("Printing all available seat ID's");
        ArrayList<Integer> occupied_seats = new ArrayList<Integer>();
        ArrayList<Integer> unoccupied_seats = new ArrayList<Integer>();
        for(Seat s : seats){
            occupied_seats.add(s.getSeat_id());

        }
        int num_seat = seatCount;
        for(int i = 1; i<(num_seat+1); i++){
            boolean occupied = false;
            for(int j=0; j< occupied_seats.size();j++){
                if(occupied_seats.get(j) == i){
                   occupied = true;
                }
            }
            if(!occupied){
                unoccupied_seats.add(i);
            }
        }
        System.out.printf(unoccupied_seats.toString()+"\n");
    }
    public void printAllSeats(){
        System.out.println("Printing all seats with their availabilities");
        int num_seat = seatCount;
        for(int i = 0; i<num_seat; i++){
            boolean occupied = false;
            for(Seat s : seats){
                if(s.getSeat_id()==(i+1)){
                    occupied=true;
                    System.out.println((i+1) + " Status: " + "Reserved" );
                }
            }
            if(!occupied){
                System.out.println((i+1) + " Status: " + "Unreserved");
            }

        }}

    public void searchPassenger(Passenger passenger ){
                    passenger.display();
                }
            }



