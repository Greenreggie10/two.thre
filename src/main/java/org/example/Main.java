package org.example;

public class Main {
    public static void main(String[] args) {

        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        //
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).

        System.out.println("You picked 500 apples from an apple orchard");

        numOfApples += 500;

        System.out.println("Time for business! You're selling each apple for 40 cents");

        double price = .40;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers++;
        profit += (price*4);
        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers++;
        profit += (price*20);
        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers++;
        profit += (price*200);



        System.out.println("Wow! So far, you made: $<profit>");
        System.out.println("<number of customers> + customers love your apples.");
        System.out.println("You have <number of apples> apples left.");

        // Compare your result to what's on Learn the Part.
    }
}