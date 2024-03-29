/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Sherlock Baldeo Joshua C. Manansala
 *
 */
public class FlightBookingManagementSystem {

    private Flight[] flightList;
    private int flightCount;
    private Administrator adminUser;
    private Passenger passengerUser;

    public FlightBookingManagementSystem(Flight[] flightList, int flightCount) {
        this.flightList = flightList;
        this.flightCount = flightCount;
    }
    
    public FlightBookingManagementSystem() {
        flightList = new Flight[100];
        flightCount = 0;
    }

    public int getSize() {
        return flightCount;
    }

    public void login(Administrator admin, String password) {
        if (admin.login(password)) {
            adminUser = admin;
            System.out.println("Administrator mode logged in.");
        }
    }

    public void logout() {
        System.out.println("Administrator mode logged out. Going back to default user mode.");
    }
    
    public void viewFlightList(int i) {
        System.out.println("\nFLIGHT NUMBER\tAIRLINE\tORIGIN\tDESTINATION\tDEPARTURE DATE\tDEPARTURE TIME");
        System.out.println(flightList[i].getFlightNumber() + "\t\t" + flightList[i].getFlightAirline()
                + "\t" + flightList[i].getFlightOrigin() + "\t" + flightList[i].getFlightDestination()
                + "\t\t" + flightList[i].getFlightDepartureDate() + "\t\t" + flightList[i].getFlightDepartureTime());
    }
}