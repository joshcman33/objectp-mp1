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
        
        Administrator admin1 = new Administrator("banana");
        
        admin1.createNewFlight("CX5401", "ePAL", "Goks", "Andrew", 071112, 1120, 1);
    }
}
