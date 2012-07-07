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
public class Passenger {
    private String firstName;
    private String middleName;
    private String lastName;
    private String passportNumber;
    
    public Passenger(String firstName, String middleName, String lastName, String passportNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
    }
    
    public void bookFlight(String flightOrigin, String flightDestination, int flightDepartureDate,
            int flightDepartureTime) {
                
    }
}