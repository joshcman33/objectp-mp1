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
    private Passenger currentUser;
    private Passenger defaultUser;

    public FlightBookingManagementSystem(Flight[] flightList, int flightCount) {
        this.flightList = flightList;
        this.flightCount = flightCount;
        currentUser = defaultUser = new Passenger();
    }

    public int getSize() {
        return flightCount;
    }

    public void login(Administrator admin, String password) {
        if (admin.login(password)) {
            currentUser = admin;
            System.out.println("Administrator mode logged in.");
        }
    }
    
    public void logout() {
        currentUser = defaultUser;
        System.out.println("Administrator mode logged out. Going back to default user mode.");
    }
}
