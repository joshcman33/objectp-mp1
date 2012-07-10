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

    /*
     * public static void chooseUser(int userChoice) { String password;
     *
     * if (userChoice == 1) { System.out.println("Enter administrator password:
     * "); Scanner scan1 = new Scanner(System.in); password = scan1.nextLine();
     * adminUser = new Administrator(password); } else if (userChoice == 2) {
     * passengerUser = new Passenger(); } }
     */
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
        System.out.println(flightList[i].getFlightNumber() + "\t\t" + flightList[i].getFlightAirline()
                + "\t" + flightList[i].getFlightOrigin() + "\t" + flightList[i].getFlightDestination()
                + "\t\t" + flightList[i].getFlightDepartureDate() + "\t\t" + flightList[i].getFlightDepartureTime());
    }
}