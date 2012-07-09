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
    private static Administrator adminUser;
    private static Passenger passengerUser;

    public FlightBookingManagementSystem(Flight[] flightList, int flightCount) {
        this.flightList = flightList;
        this.flightCount = flightCount;
    }

    /*public static void chooseUser(int userChoice) {
        String password;
        
        if (userChoice == 1) {
            System.out.println("Enter administrator password: ");
            Scanner scan1 = new Scanner(System.in);
            password = scan1.nextLine();
            adminUser = new Administrator(password);
        }
        else if (userChoice == 2) {
            passengerUser = new Passenger();
        }               
    }*/
    
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
        adminUser = NULL;
        passengerUser = new Passenger();
        System.out.println("Administrator mode logged out. Going back to default user mode.");
    }
     
}
