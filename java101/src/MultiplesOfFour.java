import java.util.Scanner;

public class MultiplesOfFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        while (true) {

            System.out.print("Enter a number (odd number to stop): ");
            number = input.nextInt();

            // stop condition: single odd number
            if (number % 2 != 0) {
                break;
            }

            // check if number is even and multiple of 4
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }

        System.out.println("Sum of even numbers that are multiples of 4: " + sum);

        input.close();
    }
}