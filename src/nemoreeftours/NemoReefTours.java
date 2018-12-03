/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nemoreeftours;
import java.util.Scanner;
/**
 *
 * @author CBX
 */
public class NemoReefTours {

    public static void main(String[] args) {
        
        //Declare Scanner
        Scanner sc = new Scanner(System.in);
        
        //Variables
        String bookingName;
        int numberOfPassengers;
        int bookingNumber = 1;
        double charge = 85.50;
        double totalCharges = 0;
        int totalPassengers = 0;
        
        //Print Welcome System
        System.out.printf("[!] Welcome to the Nemo Reef Tour Management System.\n");
        System.out.print( "\n");
        
        for (int x = 0; x < 9; x++) {
            
            System.out.println("[#] Booking number #" + bookingNumber);
            
            System.out.print("[+] Please enter the booking name: ");
            bookingName = sc.nextLine();
            
            System.out.print("[+] Enter the number of passengers: ");
            numberOfPassengers = sc.nextInt();
            sc.nextLine();
            
            totalPassengers += numberOfPassengers;
            bookingNumber++;
            
            //Check number of passengers and apply discount if any
            double charged = numberOfPassengers * charge;

            if (numberOfPassengers >= 3 && numberOfPassengers <= 5) {

                double discount = charged * 0.9;
                System.out.print("[!] Total charge with 10% discount: $");
                System.out.printf("%.2f", discount);
                System.out.print( "\n\n");
                totalCharges = totalCharges + discount;

            } else if (numberOfPassengers >= 6 && numberOfPassengers <= 10) {
                
                double discount = charged * 0.85;
                System.out.print("[!] Total charge with 15% discount: $");
                System.out.printf("%.2f", discount);
                System.out.print( "\n\n");
                totalCharges = totalCharges + discount;
            
            
            } else if (numberOfPassengers > 10) {
                
                double discount = charged * 0.8;
                System.out.print("[!] Total charge with 20% discount: $");
                System.out.printf("%.2f", discount);
                System.out.print( "\n\n");
                totalCharges = totalCharges + discount;
            
            
            } else if (numberOfPassengers >= 0 && numberOfPassengers <= 2) {
                
                System.out.println("[!] Total charge: $" + charged);
                System.out.print( "\n");
                totalCharges = totalCharges + charged;
            
            }
            
        }
        
        System.out.println("[!] Statistical information about Nemo Reef Tour\n");
        
        //Average passengers per booking
        double averagePassengers = totalPassengers / 9;
        System.out.println("[!] The average number of passengers per booking: " + averagePassengers);
        
        //Total charges collected
        System.out.print("[!] Total charges collected: $");
        System.out.printf("%.2f", totalCharges);
        
        System.out.print( "\n\n");

        System.out.println("[!] Thank you for using the Nemo Reef Tour Management System.");
        System.out.println("(#) Program written by Caue Borella - 12091393");
        
        System.out.print( "\n\n");
        
        }
    }
    
