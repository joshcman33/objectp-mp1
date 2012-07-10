/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  John Sherlock Baldeo
 *          Joshua C. Manansala
 * 
 */
public class Flight {
    private String flightNumber;
    private String flightAirline;
    private String flightOrigin;
    private String flightDestination;
    private int flightDepartureDate;
    private int flightDepartureTime;
    private int flightMaximumCapacityOfPassengers;
    private Passenger[] passengerList;
    
    public Flight(String flightNumber, String flightAirline, String flightOrigin,
            String flightDestination, int flightDepartureDate, int flightDepartureTime,
            int flightMaximumCapacityOfPassengers) {
        this.flightNumber = flightNumber;
        this.flightAirline = flightAirline;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.flightDepartureDate = flightDepartureDate;
        this.flightDepartureTime = flightDepartureTime;
        this.flightMaximumCapacityOfPassengers = flightMaximumCapacityOfPassengers;      
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }
    
    public String getFlightAirline() {
        return flightAirline;
    }
    
    public String getFlightOrigin() {
        return flightOrigin;
    }
    
    public String getFlightDestination() {
        return flightDestination;
    }
    
    public int getFlightDepartureDate() {
        return flightDepartureDate;
    }
    
    public int getFlightDepartureTime() {
        return flightDepartureTime;
    }
    
    public int getFlightMaximumCapacityOfPassengers() {
        return flightMaximumCapacityOfPassengers;
    }
}
