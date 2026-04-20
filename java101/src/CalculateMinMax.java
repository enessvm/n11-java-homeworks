import java.util.Scanner;

public class CalculateMinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = input.nextInt();

        int number;
        int min, max;

        System.out.print("Enter 1. number: ");
        number = input.nextInt();

        min = number;
        max = number;

        for (int i = 2; i <= n; i++) {

            System.out.print("Enter " + i + ". number: ");
            number = input.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

        input.close();
    }
}