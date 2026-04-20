import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        n1 = input.nextInt();

        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");

        System.out.print("Select operation: ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.println("Result: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Result: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Result: " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Result: " + (n1 / (double) n2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid selection!");
        }
    }
}