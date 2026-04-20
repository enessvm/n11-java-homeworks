import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (KM): ");
        int distance = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter trip type (1 => One Way, 2 => Round Trip): ");
        int type = input.nextInt();

        double pricePerKm = 0.10;
        double totalPrice;

        // Input validation
        if (distance <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("Please check input!");
        }
        else {

            totalPrice = distance * pricePerKm;

            // Age discount
            if (age < 12) {
                totalPrice *= 0.5;
            }
            else if (age >= 12 && age <= 24) {
                totalPrice *= 0.9;
            }
            else if (age > 65) {
                totalPrice *= 0.7;
            }

            // Round trip discount
            if (type == 2) {
                totalPrice = (totalPrice * 0.8) * 2;
            }

            System.out.println("Total Price = " + totalPrice + " TL");
        }

        input.close();
    }
}