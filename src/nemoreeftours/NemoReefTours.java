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

        //Declare Scanners
        Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        //Declare Variables
        String bookingName;
        int numberOfPassengers = 0;
        int bookingNumber = 1;
        double charge = 85.50;
        double totalCharges = 0;
        int totalPassengers = 0;
        int min = 99;
        int max = 0;
        String minName = "min name";
        String maxName = "max name";
        int numberOfLoops = 9; //The highest number in my Student ID

        //Print Welcome System
        System.out.printf("[!] Welcome to the Nemo Reef Tour Management System.\n\n");

        //Start loop 9x
        for (int x = 0; x < numberOfLoops; x++) {
            //Print booking number
            System.out.println("[#] Booking number #" + bookingNumber);

            //Get booking name
            while (true) {
                System.out.print("[+] Please enter a booking name: ");
                bookingName = inText.nextLine();

                if (bookingName.isEmpty()) {

                    System.err.println("[error] Please enter a valid name!");
                    continue;
                }

                break;
            }

            //Get number of passengers && Validate number
            while (true) {
                try {
                    System.out.print("[+] Enter the number of passengers: ");
                    numberOfPassengers = Integer.parseInt(inNum.nextLine());
                    if (numberOfPassengers <= 0) {

                        System.err.println("[error] Please enter POSITIVE and greater than ZERO number");
                        continue;
                    }
                    //Store number of passengers
                    totalPassengers += numberOfPassengers;
                    break; // this will escape the while loop
                } catch (Exception e) {
                    System.err.println("[error] That is not a number. Try again.");
                }
            }

            //Add +1 to booking numbers
            bookingNumber++;

            //Check number of passengers and apply discount if eligible to
            double charged = numberOfPassengers * charge;

            if (numberOfPassengers >= 3 && numberOfPassengers <= 5) {

                double discount = charged * 0.9;
                System.out.print("[$] Total to charge with 10% discount: $");
                System.out.printf("%.2f", discount);
                System.out.print("\n\n");
                totalCharges = totalCharges + discount;

            } else if (numberOfPassengers >= 6 && numberOfPassengers <= 10) {

                double discount = charged * 0.85;
                System.out.print("[$] Total to charge with 15% discount: $");
                System.out.printf("%.2f", discount);
                System.out.print("\n\n");
                totalCharges = totalCharges + discount;

            } else if (numberOfPassengers > 10) {

                double discount = charged * 0.8;
                System.out.print("[$] Total to charge with 20% discount: $");
                System.out.printf("%.2f", discount);
                System.out.print("\n\n");
                totalCharges = totalCharges + discount;

            } else if (numberOfPassengers >= 0 && numberOfPassengers <= 2) {

                System.out.println("[!] Total to charge: $" + charged);
                System.out.print("\n");
                totalCharges = totalCharges + charged;

            }

            if (numberOfPassengers < min) {
                min = numberOfPassengers;
                minName = bookingName;
            }
            if (numberOfPassengers > max) {
                max = numberOfPassengers;
                maxName = bookingName;
            }

        }

        System.out.print("-------------------------------------------------------------\n\n");

        System.out.println("Statistical information about Nemo Reef Tour\n");

        //Average passengers per booking
        double averagePassengers = totalPassengers / numberOfLoops;
        System.out.println("[!] The average number of passengers per booking: " + averagePassengers);

        //Total charges collected
        System.out.print("[!] Total charges collected: $");
        System.out.printf("%.2f", totalCharges);

        System.out.print("\n");

        System.out.println("[!] The highest number of passengers is: " + max + " booked by " + maxName);
        System.out.println("[!] The minimum number of passengers is: " + min + " booked by " + minName);

        System.out.print("\n");
        System.out.print("-------------------------------------------------------------\n");
        System.out.print("\n");

        System.out.println("[!] Thank you for using the Nemo Reef Tour Management System.");
        System.out.println("(#) Program written by Caue Borella - 12091393");
        System.out.println("(#) CQU 2018 - Introduction to Programming");

        System.out.print("\n\n");

    }
}
