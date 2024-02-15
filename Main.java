
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {


        Bus bus=new Bus("06 HUBM 06", 42);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1-Book a seat");
            System.out.println("2-Cancel booking");
            System.out.println("3-Print all passengers");
            System.out.println("4-Print available seats");
            System.out.println("5-Print all seats");
            System.out.println("6-Search passenger");
            System.out.println("7-Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter seat id: ");
                    int seatId = scanner.nextInt();
                    System.out.print("Enter name for booking: ");
                    String name = scanner.next();
                    boolean exist = false;
                    for(Passenger p : passengers){
                        if(p.getName().equals(name)) {
                            bus.bookSeat(p, seatId);
                            exist = true;

                        } }
                    if(!exist){
                        System.out.print("Enter surname: ");
                        String surname = scanner.next();
                        System.out.print("Enter Gender: ");
                        String gender = scanner.next();
                        System.out.print("Enter country code: ");
                        String country_code = scanner.next();
                        System.out.print("Enter code: ");
                        String code = scanner.next();
                        System.out.print("Enter number: ");
                        String number = scanner.next();
                        System.out.print("Enter type: ");
                        String type = scanner.next();
                        Phone phone = new Phone(country_code,code,number,type);
                        Passenger passenger = new  Passenger(name,surname,gender,phone);
                        bus.bookSeat(passenger, seatId);
                        passengers.add(passenger);
                 }
                    break;
                case 2:
                    System.out.print("Enter seatId for cancel booking: ");
                    int seatId1 = scanner.nextInt();
                    bus.CancelBooking(seatId1);
                    break;
                case 3:
                    bus.printAllPassengers();
                    break;
                case 4:
                    bus.printAllAvailableSeatIDs();
                    break;
                case 5:
                    bus.printAllSeats();
                    break;
                case 6:
                    System.out.print("Enter name for search: ");
                    String name1 = scanner.next();
                    System.out.print("Enter surname for search: ");
                    String surname = scanner.next();
                    for(Passenger p : passengers){
                        if(p.getName().equals(name1) & p.getSurname().equals(surname)) {
                            bus.searchPassenger(p);
                            System.out.println("Seat: " +(passengers.indexOf(p)+1) + " Status: Reserved");
                        } }

                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    }


