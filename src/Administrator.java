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
    
    public void createNewFlight(String flightNumber, String flightAirline,
            String flightOrigin, String flightDestination, int flightDepartureDate,
            int flightDepartureTime, int flightMaximumCapacityOfPassengers) {
        
        Flight flight1 = new Flight(flightNumber, flightAirline,
            flightOrigin, flightDestination, flightDepartureDate,
            flightDepartureTime, flightMaximumCapacityOfPassengers);
    }

        public void viewAllFlights() {
            
    }
    
    public void modifyFlightEntry() {
        
    }
}
