/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Sherlock Baldeo Joshua C. Manansala
 *
 */
import java.util.Scanner;

public class Administrator {

    private String password;

    public Administrator(String password) {
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }

    public int createNewFlight(Flight[] flightList, int flightCount, String flightNumber, String flightAirline,
            String flightOrigin, String flightDestination, int flightDepartureDate,
            int flightDepartureTime, int flightMaximumCapacityOfPassengers) {

        flightList[flightCount] = new Flight(flightNumber, flightAirline,
                flightOrigin, flightDestination, flightDepartureDate,
                flightDepartureTime, flightMaximumCapacityOfPassengers);

        return ++flightCount;
    }

    public void viewAllFlights(FlightBookingManagementSystem fbms) {
        int i = 0;
        char direction;
        Scanner userInput = new Scanner(System.in);

        while (i >= 0 && i < fbms.getSize()) {
            fbms.viewFlightList(i);

            System.out.println("\nEnter [P]revious or [N]ext: ");
            direction = userInput.nextLine().charAt(0);

            if (fbms.getSize() > 1) {
                if (direction == 'P' && i > 0) {
                    i--;
                } else if (direction == 'N' && i < fbms.getSize()-1) {
                    i++;
                } else {
                    System.out.println("\nReached the end of the list. Invalid Command.\n");
                    break;
                }
            } else {
                System.out.println("\nNo other entries found.\n");
                break;
            }
        }
    }

    public void modifyFlightEntry(FlightBookingManagementSystem fbms) {
        
    }
}
