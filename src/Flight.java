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
}
