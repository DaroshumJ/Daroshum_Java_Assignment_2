/* Chapter 6 Ex6.8
(Parking Charges) A parking garage charges a $2.00 minimum fee to park 
for up to three hours. The garage charges an additional $0.50 per hour 
for each hour or part thereof in excess of three hours. The maximum 
charge for any given 24-hour period is $10.00. Assume that no car parks 
for longer than 24 hours at a time. Write an application that calculates
and displays the parking charges for each customer who parked in the garage 
yesterday. You should enter the hours parked for each customer. The program 
should display the charge for the current customer and should calculate and 
display the running total of yesterday’s receipts. It should use the method 
calculateCharges to determine the charge for each customer.
*/

import java.util.Scanner;

public class ex68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.println("Welcome to the parking garage!");
        System.out.println("Enter the hours parked for each customer. Enter -1 to finish.");

        while (true) {
            System.out.print("Enter hours parked (or -1 to finish): ");
            double hoursParked = input.nextDouble();

            if (hoursParked == -1) {
                break;
            }

            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;
            System.out.printf("Customer charge: $%.2f%n", charge);
        }

        input.close();
        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
    }

    public static double calculateCharges(double hoursParked) {
        double totalCharge = 2.0; // Minimum fee up to 3 hours

        // Calculate additional charge for hours over 3
        if (hoursParked > 3) {
            totalCharge += (hoursParked - 3) * 0.50;
        } 
        
        // Cap the charge at $10.00 for any 24-hour period
        if (totalCharge > 10.00) {
            return 10.00; // If totalCharge exceeds $10.00, return $10.00
        } else {
            return totalCharge; // Otherwise, return the calculated charge
        }
    }
}
