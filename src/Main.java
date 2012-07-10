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

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int userChoice;
        
        System.out.println("\nWelcome to DLS Flight Booking Management System!\n");
        
        System.out.println("Choose user mode:");
        System.out.println("[1] Administrator");
        System.out.println("[2] Passenger");
        System.out.println("Enter number of your choice here: ");
        
        Scanner scan1 = new Scanner(System.in);
        userChoice = scan1.nextInt();
        
        FlightBookingManagementSystem.chooseUser(userChoice);*/
        
        int flightCount = 0;
        
        Flight[] flightList = new Flight[100];
        
        FlightBookingManagementSystem fbms = new FlightBookingManagementSystem();
                
        Administrator admin = new Administrator("banana");
        
        fbms.login(admin, "banana");
        
        flightCount = admin.createNewFlight(flightList, flightCount, "PL5401", "PAL", "Goks", "Andrew", 071112, 1120, 300);
        
        fbms = new FlightBookingManagementSystem(flightList, flightCount);
        
        flightCount = admin.createNewFlight(flightList, flightCount, "CX5401", "CP", "Andrew", "Yuchengco", 071212, 2320, 300);
        
        fbms = new FlightBookingManagementSystem(flightList, flightCount);
        
        admin.viewAllFlights(fbms);
    }
}
