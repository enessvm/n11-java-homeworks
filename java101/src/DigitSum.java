import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int tempNumber = number;
        int sum = 0;

        while (tempNumber != 0) {

            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}