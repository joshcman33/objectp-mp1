/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Sherlock Baldeo Joshua C. Manansala
 *
 */
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
        System.out.println("FLIGHT NUMBER\tAIRLINE\tORIGIN\tDESTINATION\tDEPARTURE DATE\tDEPARTURE TIME");
        for (int i = 0; i < fbms.getSize(); i++) {
            fbms.viewFlightList(i);
        }
    }

    public void modifyFlightEntry() {
    }
}
