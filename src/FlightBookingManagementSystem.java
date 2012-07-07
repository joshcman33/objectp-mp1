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
public class FlightBookingManagementSystem {
    private Flight[] flightList;
    private int flightCount;
    private Passenger defaultPassenger;
    
    public FlightBookingManagementSystem(Flight[] flightList, int flightCount, Passenger defaultPassenger) {
        this.flightList = flightList;
        this.flightCount = flightCount;
        this.defaultPassenger = defaultPassenger;
    }
}
