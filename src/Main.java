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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int flightCount = 0;
        
        Flight[] flightList = new Flight[100];
        
        FlightBookingManagementSystem fbms = new FlightBookingManagementSystem();
                
        Administrator admin = new Administrator("banana");
        
        fbms.login(admin, "banana");
        
        flightCount = admin.createNewFlight(flightList, flightCount, "PL5401", "PAL", "Manila", "Davao", 071112, 1120, 300);
        
        fbms = new FlightBookingManagementSystem(flightList, flightCount);
        
        flightCount = admin.createNewFlight(flightList, flightCount, "CX5879", "CP", "Manila", "Hongkong", 071212, 2320, 800);
        
        fbms = new FlightBookingManagementSystem(flightList, flightCount);
        
        flightCount = admin.createNewFlight(flightList, flightCount, "AS2598", "AS", "Manila", "Aklan", 071312, 1000, 500);
        
        fbms = new FlightBookingManagementSystem(flightList, flightCount);
        
        admin.viewAllFlights(fbms);
    }
}
